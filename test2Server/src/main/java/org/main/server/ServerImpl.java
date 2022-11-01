package org.main.server;

import com.google.protobuf.ByteString;
import io.grpc.stub.StreamObserver;
import org.main.cleint.*;
import org.main.server.cache.CacheStorage;



public class ServerImpl extends FileOperationsGrpc.FileOperationsImplBase{

    @Override
    public void sendFile(PutCsv request, StreamObserver<Response> responseObserver) {
        System.out.println("Inside add file");
        CacheStorage.hsAddObject(request.getName(),request.getCsv().toByteString());
        Response response = Response.newBuilder().setResponse("added").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getFile(CsvName request, StreamObserver<ResponseBytes> responseObserver) {
        System.out.println("Inside get file");
        ByteString bytestr = CacheStorage.hsGetObject(request.getName());
        ResponseBytes responseBytes = ResponseBytes.newBuilder().setBytes(CacheStorage.hsGetObject(request.getName())).build();
        responseObserver.onNext(responseBytes);
        responseObserver.onCompleted();

    }
}

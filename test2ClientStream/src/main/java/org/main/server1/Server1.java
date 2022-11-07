package org.main.server1;

import com.google.protobuf.ByteString;
import io.grpc.stub.StreamObserver;
import org.main.cleint.*;
import org.main.server1.cache.Cache;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Server1 extends FileOperationsGrpc.FileOperationsImplBase {
    List<byte[]> b = new ArrayList<>();
    String fileName;
    @Override
    public StreamObserver<PutCsv> sendFile(StreamObserver<Response> responseObserver) {

        return new StreamObserver<PutCsv>() {
            @Override
            public void onNext(PutCsv putCsv) {
               fileName = putCsv.getName();
                System.out.println("in");
                b.add(putCsv.getCsv().toByteArray());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(Arrays.toString(throwable.getStackTrace()));
            }

            @Override
            public void onCompleted() {
                System.out.println("Onc");
                for (int i = 0; i < b.size(); i++) {
                    try {
                        System.out.println("goning + "+ i+1);
                        Cache.setCache(fileName,b.get(i));
                    } catch (IOException e) {
                        System.out.println("ERRRRRROR");
                        throw new RuntimeException(e);
                    }
                }

                System.out.println("File added successfully");
            }
        };
    }

    @Override
    public void getFile(CsvName request, StreamObserver<ResponseBytes> responseObserver) {
        byte[] bytes = Cache.getCache(request.getName());
        ByteString byteString = ByteString.copyFrom(bytes);
        ResponseBytes responseBytes = ResponseBytes.newBuilder().setBytes(byteString).build();
        responseObserver.onNext(responseBytes);
        responseObserver.onCompleted();
    }
}

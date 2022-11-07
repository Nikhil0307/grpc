package org.main.master;

import io.grpc.stub.StreamObserver;
import org.main.cleint.*;

import java.util.HashMap;

public class MasterServerImpl extends FileOperationsGrpc.FileOperationsImplBase {
    HashMap<String, Long> details =MetaData.GETNode();
    @Override
    public void getFile(CsvName request, StreamObserver<ResponseBytes> responseObserver) {

    }
//
//    @Override
//    public StreamObserver<PutCsv> sendFile(StreamObserver<Response> responseObserver) {
//
//    }
}

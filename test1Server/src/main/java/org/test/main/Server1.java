package org.test.main;

import io.grpc.stub.StreamObserver;
import org.test.main.cache.Cache;

public class Server1 extends TestingGrpc.TestingImplBase{
    @Override
    public void addObject(ObjReq req , StreamObserver<Response> responseObserver){
        Cache.cache.put(req.getObject().getKey(),req.getObject().getVal());
        Response response = Response.newBuilder().setRes("added").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getObject(GetReq request, StreamObserver<Response> responseObserver) {
        String ans = String.valueOf(Cache.cache.get(request.getKey()));
        Response response = Response.newBuilder().setRes(ans).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

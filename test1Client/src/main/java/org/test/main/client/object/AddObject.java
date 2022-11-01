package org.test.main.client.object;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.test.main.ObjReq;
import org.test.main.Object;
import org.test.main.Response;
import org.test.main.TestingGrpc;


public class AddObject {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:50051").usePlaintext().build();
        TestingGrpc.TestingBlockingStub stub = TestingGrpc.newBlockingStub(channel);
        ObjReq objReq = ObjReq.newBuilder().setObject(Object.newBuilder().setKey(1).setVal("This is added at first").build()).build();
        Response response = stub.addObject(objReq);
        System.out.println(response.getRes());
    }
}

package org.test.main.client.object;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.test.main.*;
import org.test.main.Object;

public class GetObject {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:50051").usePlaintext().build();
        TestingGrpc.TestingBlockingStub stub = TestingGrpc.newBlockingStub(channel);
        GetReq getReq = GetReq.newBuilder().setKey(1).build();
        Response response = stub.getObject(getReq);
        System.out.println(response.getRes());
    }
}

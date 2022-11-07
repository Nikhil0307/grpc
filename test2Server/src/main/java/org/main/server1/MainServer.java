package org.main.server1;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.nio.ByteBuffer;

public class MainServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50051).addService(new ServerImpl()).maxInboundMessageSize(1024*1024*1500).build();
        ByteBuffer directbuffer = ByteBuffer.allocate(2000);
        server.start();
        System.out.println("Server 1 started");
        server.awaitTermination();
    }
}

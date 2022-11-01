package org.main.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class MainServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50051).addService(new ServerImpl()).maxInboundMessageSize(1024*1024*1500).build();
        server.start();
        System.out.println("Server 1 started");
        server.awaitTermination();
    }
}

package org.test.main;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class MainServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50051).addService(new Server1() ).build();
        server.start();
        System.out.println("Server 1 started");
        server.awaitTermination();
    }
}

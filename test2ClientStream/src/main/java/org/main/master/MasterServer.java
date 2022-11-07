package org.main.master;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class MasterServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50052).addService(new MasterServerImpl()).maxInboundMessageSize(1024*1024*1500).build();
        server.start();
        server.awaitTermination();
    }
}

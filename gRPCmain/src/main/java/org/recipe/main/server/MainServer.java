package org.recipe.main.server;


import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.io.InterruptedIOException;

public class MainServer {
    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder.forPort(5005).addService(new ServerIMPL() ).build();
        server.start();
        System.out.println("Server 1 started");
        server.awaitTermination();
    }
}

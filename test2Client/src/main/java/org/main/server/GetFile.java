package org.main.server;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.NettyChannelBuilder;
import org.main.cleint.CsvName;
import org.main.cleint.FileOperationsGrpc;
import org.main.cleint.Response;
import org.main.cleint.ResponseBytes;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GetFile {
    public static void main(String[] args) throws IOException {
        ManagedChannel channel = NettyChannelBuilder.forTarget("localhost:50051").maxInboundMessageSize(1024*1024*1500).usePlaintext().build();
        FileOperationsGrpc.FileOperationsBlockingStub stub = FileOperationsGrpc.newBlockingStub(channel);
        long start = System.currentTimeMillis();
        CsvName csvName = CsvName.newBuilder().setName("flight").build();
        ResponseBytes responseBytes = stub.getFile(csvName);
        byte [] bytes = responseBytes.toByteArray();

        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println(elapsedTime  + "  -- Time for saving a csv from server ");

        Files.write(Paths.get("/home/local/ZOHOCORP/nikhil-pt6082/Downloads/csv's/flightcopy.csv"), bytes);
//      Files.write(Paths.get("/home/local/ZOHOCORP/nikhil-pt6082/Downloads/csv's/samplecopy.csv"), responseBytes.toByteArray());
        System.out.println("Done everything...");

    }
}

package org.main.client;

import io.grpc.ManagedChannel;
import io.grpc.netty.NettyChannelBuilder;
import org.main.cleint.CsvName;
import org.main.cleint.FileOperationsGrpc;
import org.main.cleint.ResponseBytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GetFile {
    public static void main(String[] args) throws IOException {
        ManagedChannel channel = NettyChannelBuilder.forTarget("172.24.185.32:50051").maxInboundMessageSize(1024*1024*1500).usePlaintext().build();//172.24.185.32
//        ManagedChannel channel = NettyChannelBuilder.forTarget("localhost:50051").maxInboundMessageSize(1024*1024*1500).usePlaintext().build();
        FileOperationsGrpc.FileOperationsBlockingStub stub = FileOperationsGrpc.newBlockingStub(channel);
//        CsvName csvName = CsvName.newBuilder().setName("airline").build();
        CsvName csvName = CsvName.newBuilder().setName("flight").build();
        ResponseBytes responseBytes = stub.getFile(csvName);
        byte [] bytes = responseBytes.toByteArray();

//        Files.write(Paths.get("/home/local/ZOHOCORP/nikhil-pt6082/Downloads/csv's/copys/airline_copy1.csv"), responseBytes.toByteArray());
        Files.write(Paths.get("/home/local/ZOHOCORP/nikhil-pt6082/Downloads/csv's/copys/flight_copy1.csv"), responseBytes.toByteArray());
        System.out.println("Done everything...");
    }
}

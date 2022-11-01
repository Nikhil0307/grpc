package org.main.server;

import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.NettyChannelBuilder;
import org.main.cleint.CSV;
import org.main.cleint.FileOperationsGrpc;
import org.main.cleint.PutCsv;
import org.main.cleint.Response;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AddFile {
    public static void main(String[] args) throws IOException {
        ManagedChannel channel = NettyChannelBuilder.forTarget("localhost:50051").maxInboundMessageSize(1024*1024*1500).usePlaintext().build();
        FileOperationsGrpc.FileOperationsBlockingStub stub = FileOperationsGrpc.newBlockingStub(channel);
        long start = System.currentTimeMillis();
//     String file = "/home/local/ZOHOCORP/nikhil-pt6082/Downloads/Sample-Spreadsheet-5000-rows.csv";
        String file = "/home/local/ZOHOCORP/nikhil-pt6082/Downloads/csv's/Combined_Flights_2022.csv";
        final byte[] bytes = Files.readAllBytes(Paths.get(file));
        ByteString bs = ByteString.copyFrom(bytes);
        PutCsv putCsv = PutCsv.newBuilder().setCsv(CSV.newBuilder().setCsv(bs)).setName("flight").build();
//        PutCsv putCsv = PutCsv.newBuilder().setCsv(CSV.newBuilder().setCsv(bs)).setName("s1").build();

        Response response = stub.sendFile(putCsv);
        System.out.println(response.getResponse());
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println(elapsedTime  + "  -- Time for sending to server ");
    }
}

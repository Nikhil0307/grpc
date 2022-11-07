package org.main.client;

import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.main.cleint.CSV;
import org.main.cleint.FileOperationsGrpc;
import org.main.cleint.PutCsv;
import org.main.cleint.Response;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddFile {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileOperationsGrpc.FileOperationsStub asyncStub ;
        StreamObserver<Response> responseStreamObserver = new StreamObserver<Response>() {
            @Override
            public void onNext(Response response) {
                System.out.println(response.getResponse());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Completedddd");
            }
        };
//      172.24.185.32
        ManagedChannel channel = NettyChannelBuilder.forTarget("172.24.185.32:50051").maxInboundMessageSize(1024*1024*1500).usePlaintext().build();
//        ManagedChannel channel = NettyChannelBuilder.forTarget("localhost:50051").maxInboundMessageSize(1024*1024*1500).usePlaintext().build();
        asyncStub = FileOperationsGrpc.newStub(channel);
        StreamObserver<PutCsv> putCsvStreamObserver = asyncStub.sendFile(responseStreamObserver);
        String file ="/home/local/ZOHOCORP/nikhil-pt6082/Downloads/csv's/Combined_Flights_2022.csv";
        final byte[] bytes = Files.readAllBytes(Paths.get(file));

        List<byte[]> ls = new ArrayList<>();
        int start = 0;
        int chunksize = 20000000;
        int c = 0;
        if (bytes.length<chunksize){
            ls.add(bytes);
        }else {
            while (start < bytes.length) {
                int end = Math.min(bytes.length, start + chunksize);
                ls.add(Arrays.copyOfRange(bytes, start, end));
                start += chunksize;
                c++;
            }
        }
        System.out.println(c);
        for (int i = 0; i < ls.size(); i++) {
            ByteString bs1 = ByteString.copyFrom(ls.get(i));
            PutCsv putCsv1 = PutCsv.newBuilder().setCsv(CSV.newBuilder().setCsv(bs1).build()).setName("flight").build();
            putCsvStreamObserver.onNext(putCsv1);
            Thread.sleep(500);
        }
          putCsvStreamObserver.onCompleted();
    }

}

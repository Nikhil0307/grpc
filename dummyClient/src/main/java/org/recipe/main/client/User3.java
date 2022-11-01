package org.recipe.main.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.recipe.main.*;

import java.io.IOException;

public class User3 {
    public static void main(String[] args) throws IOException, InterruptedException {
//        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50051).usePlaintext().build();
        ManagedChannel channel = ManagedChannelBuilder.forTarget("172.24.188.45:50051").usePlaintext().build();
        RecipeServiceGrpc.RecipeServiceBlockingStub stub = RecipeServiceGrpc.newBlockingStub(channel);

        digit dig = digit.newBuilder().setDig(2147483647).build();
        try {
            Response response = stub.addAndGetInt(dig);
            System.out.println(response.getResult());
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Done from client 3");
    }
}

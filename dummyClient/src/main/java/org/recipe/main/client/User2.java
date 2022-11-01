package org.recipe.main.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.recipe.main.*;

import java.io.IOException;

public class User2 {
    public static void main(String[] args) throws IOException, InterruptedException {
//        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50051).usePlaintext().build();
        ManagedChannel channel = ManagedChannelBuilder.forTarget("172.24.188.45:50051").usePlaintext().build();
        RecipeServiceGrpc.RecipeServiceBlockingStub stub = RecipeServiceGrpc.newBlockingStub(channel);

        recipeName name = recipeName.newBuilder().setRecipeName("Fried rice").build();
        try {
            Response response = stub.getRecipe(name);
            System.out.println(response.getResult());
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Done from client 2");
    }
}

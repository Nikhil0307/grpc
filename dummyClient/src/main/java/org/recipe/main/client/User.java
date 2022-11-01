package org.recipe.main.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.recipe.main.Recipe;
import org.recipe.main.RecipeServiceGrpc;
import org.recipe.main.Response;
import org.recipe.main.recipeRequest;

import java.io.IOException;

public class User {
    public static void main(String[] args) throws IOException, InterruptedException {
//        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",5005).usePlaintext().build();
        ManagedChannel channel = ManagedChannelBuilder.forTarget("172.24.188.45:50051").usePlaintext().build();
        RecipeServiceGrpc.RecipeServiceBlockingStub stub = RecipeServiceGrpc.newBlockingStub(channel);
//        "121.244.91.51"
//        "10.0.2.15"
        recipeRequest recipeReq = recipeRequest.newBuilder().setRecipe(Recipe.newBuilder().setRecipe("Fried rice").setProcess("Process will be updated soon for cooking fried rice").build()).build();
        try {
            Response response = stub.addRecipe(recipeReq);
            System.out.println(response.getResult());
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Done from client 1");
    }
}

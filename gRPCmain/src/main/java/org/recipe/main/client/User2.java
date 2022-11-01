package org.recipe.main.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.recipe.main.*;

public class User2 {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",5005).usePlaintext().build();
        RecipeServiceGrpc.RecipeServiceBlockingStub stub = RecipeServiceGrpc.newBlockingStub(channel);

        recipeName name = recipeName.newBuilder().setRecipeName("Briyani").build();
        try {
            Response response = stub.getRecipe(name);
            System.out.println(response.getResult());
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Done from client 2");
    }
}

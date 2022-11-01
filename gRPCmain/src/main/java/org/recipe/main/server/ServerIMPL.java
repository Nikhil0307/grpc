package org.recipe.main.server;


import io.grpc.stub.StreamObserver;
import org.recipe.main.RecipeServiceGrpc;
import org.recipe.main.Response;
import org.recipe.main.recipeName;
import org.recipe.main.recipeRequest;
import org.recipe.main.server.Cache.Cache;


public class ServerIMPL extends RecipeServiceGrpc.RecipeServiceImplBase{


    @Override
    public void addRecipe(recipeRequest request, StreamObserver<Response> responseObserver){
        System.out.println("hiii");
        Cache.SetRecipe(request.getRecipe().getRecipe(),request.getRecipe().getProcess());
        Response response = Response.newBuilder().setResult("Added").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    @Override
    public void getRecipe(recipeName request, StreamObserver<Response> responseObserver) {
        String process = Cache.GetProcess(request.getRecipeName());
        Response response = Response.newBuilder().setResult(process).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

package org.recipe.main;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: Recipe.proto")
public final class RecipeServiceGrpc {

  private RecipeServiceGrpc() {}

  public static final String SERVICE_NAME = "org.recipe.main.RecipeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.recipe.main.recipeRequest,
      org.recipe.main.Response> METHOD_ADD_RECIPE =
      io.grpc.MethodDescriptor.<org.recipe.main.recipeRequest, org.recipe.main.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.recipe.main.RecipeService", "addRecipe"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.recipe.main.recipeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.recipe.main.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.recipe.main.recipeName,
      org.recipe.main.Response> METHOD_GET_RECIPE =
      io.grpc.MethodDescriptor.<org.recipe.main.recipeName, org.recipe.main.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.recipe.main.RecipeService", "getRecipe"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.recipe.main.recipeName.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.recipe.main.Response.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RecipeServiceStub newStub(io.grpc.Channel channel) {
    return new RecipeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RecipeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RecipeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RecipeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RecipeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RecipeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addRecipe(org.recipe.main.recipeRequest request,
        io.grpc.stub.StreamObserver<org.recipe.main.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_RECIPE, responseObserver);
    }

    /**
     */
    public void getRecipe(org.recipe.main.recipeName request,
        io.grpc.stub.StreamObserver<org.recipe.main.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_RECIPE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_ADD_RECIPE,
            asyncUnaryCall(
              new MethodHandlers<
                org.recipe.main.recipeRequest,
                org.recipe.main.Response>(
                  this, METHODID_ADD_RECIPE)))
          .addMethod(
            METHOD_GET_RECIPE,
            asyncUnaryCall(
              new MethodHandlers<
                org.recipe.main.recipeName,
                org.recipe.main.Response>(
                  this, METHODID_GET_RECIPE)))
          .build();
    }
  }

  /**
   */
  public static final class RecipeServiceStub extends io.grpc.stub.AbstractStub<RecipeServiceStub> {
    private RecipeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecipeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecipeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecipeServiceStub(channel, callOptions);
    }

    /**
     */
    public void addRecipe(org.recipe.main.recipeRequest request,
        io.grpc.stub.StreamObserver<org.recipe.main.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_RECIPE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRecipe(org.recipe.main.recipeName request,
        io.grpc.stub.StreamObserver<org.recipe.main.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_RECIPE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RecipeServiceBlockingStub extends io.grpc.stub.AbstractStub<RecipeServiceBlockingStub> {
    private RecipeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecipeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecipeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecipeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.recipe.main.Response addRecipe(org.recipe.main.recipeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_RECIPE, getCallOptions(), request);
    }

    /**
     */
    public org.recipe.main.Response getRecipe(org.recipe.main.recipeName request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_RECIPE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RecipeServiceFutureStub extends io.grpc.stub.AbstractStub<RecipeServiceFutureStub> {
    private RecipeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecipeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecipeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecipeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.recipe.main.Response> addRecipe(
        org.recipe.main.recipeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_RECIPE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.recipe.main.Response> getRecipe(
        org.recipe.main.recipeName request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_RECIPE, getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_RECIPE = 0;
  private static final int METHODID_GET_RECIPE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RecipeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RecipeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_RECIPE:
          serviceImpl.addRecipe((org.recipe.main.recipeRequest) request,
              (io.grpc.stub.StreamObserver<org.recipe.main.Response>) responseObserver);
          break;
        case METHODID_GET_RECIPE:
          serviceImpl.getRecipe((org.recipe.main.recipeName) request,
              (io.grpc.stub.StreamObserver<org.recipe.main.Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class RecipeServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.recipe.main.RecipeOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RecipeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RecipeServiceDescriptorSupplier())
              .addMethod(METHOD_ADD_RECIPE)
              .addMethod(METHOD_GET_RECIPE)
              .build();
        }
      }
    }
    return result;
  }
}

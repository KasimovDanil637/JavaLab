package web.pb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: storehouse.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StorehouseServiceGrpc {

  private StorehouseServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "StorehouseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<web.pb.ProviderRequest,
      web.pb.ProviderResponse> getAddNewMerchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addNewMerch",
      requestType = web.pb.ProviderRequest.class,
      responseType = web.pb.ProviderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.pb.ProviderRequest,
      web.pb.ProviderResponse> getAddNewMerchMethod() {
    io.grpc.MethodDescriptor<web.pb.ProviderRequest, web.pb.ProviderResponse> getAddNewMerchMethod;
    if ((getAddNewMerchMethod = StorehouseServiceGrpc.getAddNewMerchMethod) == null) {
      synchronized (StorehouseServiceGrpc.class) {
        if ((getAddNewMerchMethod = StorehouseServiceGrpc.getAddNewMerchMethod) == null) {
          StorehouseServiceGrpc.getAddNewMerchMethod = getAddNewMerchMethod =
              io.grpc.MethodDescriptor.<web.pb.ProviderRequest, web.pb.ProviderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addNewMerch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.pb.ProviderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.pb.ProviderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StorehouseServiceMethodDescriptorSupplier("addNewMerch"))
              .build();
        }
      }
    }
    return getAddNewMerchMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StorehouseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorehouseServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorehouseServiceStub>() {
        @java.lang.Override
        public StorehouseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorehouseServiceStub(channel, callOptions);
        }
      };
    return StorehouseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StorehouseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorehouseServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorehouseServiceBlockingStub>() {
        @java.lang.Override
        public StorehouseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorehouseServiceBlockingStub(channel, callOptions);
        }
      };
    return StorehouseServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StorehouseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StorehouseServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StorehouseServiceFutureStub>() {
        @java.lang.Override
        public StorehouseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StorehouseServiceFutureStub(channel, callOptions);
        }
      };
    return StorehouseServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void addNewMerch(web.pb.ProviderRequest request,
        io.grpc.stub.StreamObserver<web.pb.ProviderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddNewMerchMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StorehouseService.
   */
  public static abstract class StorehouseServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StorehouseServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StorehouseService.
   */
  public static final class StorehouseServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StorehouseServiceStub> {
    private StorehouseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorehouseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorehouseServiceStub(channel, callOptions);
    }

    /**
     */
    public void addNewMerch(web.pb.ProviderRequest request,
        io.grpc.stub.StreamObserver<web.pb.ProviderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddNewMerchMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StorehouseService.
   */
  public static final class StorehouseServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StorehouseServiceBlockingStub> {
    private StorehouseServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorehouseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorehouseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public web.pb.ProviderResponse addNewMerch(web.pb.ProviderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddNewMerchMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StorehouseService.
   */
  public static final class StorehouseServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StorehouseServiceFutureStub> {
    private StorehouseServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StorehouseServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StorehouseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<web.pb.ProviderResponse> addNewMerch(
        web.pb.ProviderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddNewMerchMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_NEW_MERCH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_NEW_MERCH:
          serviceImpl.addNewMerch((web.pb.ProviderRequest) request,
              (io.grpc.stub.StreamObserver<web.pb.ProviderResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddNewMerchMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              web.pb.ProviderRequest,
              web.pb.ProviderResponse>(
                service, METHODID_ADD_NEW_MERCH)))
        .build();
  }

  private static abstract class StorehouseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StorehouseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return web.pb.Storehouse.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StorehouseService");
    }
  }

  private static final class StorehouseServiceFileDescriptorSupplier
      extends StorehouseServiceBaseDescriptorSupplier {
    StorehouseServiceFileDescriptorSupplier() {}
  }

  private static final class StorehouseServiceMethodDescriptorSupplier
      extends StorehouseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    StorehouseServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StorehouseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StorehouseServiceFileDescriptorSupplier())
              .addMethod(getAddNewMerchMethod())
              .build();
        }
      }
    }
    return result;
  }
}

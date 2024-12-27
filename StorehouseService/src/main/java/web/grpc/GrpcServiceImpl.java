package web.grpc;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.pb.*;
import web.service.MerchService;

@Service
@RequiredArgsConstructor
public class GrpcServiceImpl extends StorehouseServiceGrpc.StorehouseServiceImplBase {

    private final MerchService merchService;

    @Override
    public void getMerchAvailability(StorehouseRequest request, StreamObserver<StorehouseResponse> responseObserver) {
        StorehouseResponse response = StorehouseResponse.newBuilder()
                .setIsHas(merchService.isAvailability(request.getId()))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void addNewMerch(ProviderRequest request, StreamObserver<ProviderResponse> responseObserver) {
        Long id = merchService.saveMerch(request.getName(), request.getCount());

        ProviderResponse response = ProviderResponse.newBuilder()
                .setId(id)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
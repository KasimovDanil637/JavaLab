package web.accessors;

import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import web.dto.MerchDto;
import web.pb.ProviderRequest;
import web.pb.ProviderResponse;
import web.pb.StorehouseServiceGrpc;

@Service
public class StorehouseService {

    @GrpcClient("storehouse-service")
    private StorehouseServiceGrpc.StorehouseServiceBlockingStub stub;

    public ProviderResponse addNewMerch(MerchDto merchDto) {
        ProviderRequest request = ProviderRequest.newBuilder()
                .setName(merchDto.getName())
                .setCount(merchDto.getCount())
                .build();

        ProviderResponse response;

        try {
            response = stub.addNewMerch(request);
        } catch (StatusRuntimeException e) {
            throw new RuntimeException("Ошибка gRPC: " + e.getStatus());
        }
        return response;
    }
}
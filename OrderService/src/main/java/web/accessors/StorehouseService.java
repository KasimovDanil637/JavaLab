package web.accessors;

import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import web.exceptions.InvalidDataException;
import org.springframework.stereotype.Service;
import web.pb.StorehouseRequest;
import web.pb.StorehouseResponse;
import web.pb.StorehouseServiceGrpc;

@Service
public class StorehouseService {

    @GrpcClient("storehouse-service")
    private StorehouseServiceGrpc.StorehouseServiceBlockingStub stub;

    public void checkMerchFromStorehouse(Long id) {
        if (!getMerchAvailability(id).getIsHas()) {
            throw new InvalidDataException("Товара нет в наличии.");
        };
    }

    private StorehouseResponse getMerchAvailability(long id) {
        StorehouseRequest request = StorehouseRequest.newBuilder()
                .setId(id)
                .build();

        StorehouseResponse response;

        try {
            response = stub.getMerchAvailability(request);
        } catch (StatusRuntimeException e) {
            throw new RuntimeException("Ошибка gRPC: " + e.getStatus());
        }
        return response;
    }
}
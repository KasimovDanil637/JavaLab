package web.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@RequiredArgsConstructor
public class GrpcServer {

    private Server server;

    private final GrpcServiceImpl merchService;

    @PostConstruct
    public void start() throws Exception {
        server = ServerBuilder.forPort(9999)
                .addService(merchService)
                .build()
                .start();

        Runtime.getRuntime().addShutdownHook(new Thread(GrpcServer.this::stop));
    }

    @PreDestroy
    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }
}
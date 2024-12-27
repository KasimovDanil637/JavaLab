package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class StorehouseServiceApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StorehouseServiceApplication.class, args);
    }
}

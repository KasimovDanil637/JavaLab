package web;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("order-service",
                    r -> r.path("/order-service/**")
                            .filters(f -> f.rewritePath("/order-service/(?<segment>.*)", "/orders/${segment}"))
                            .uri("lb://order-service"))
                .route("delivery-service",
                        r -> r.path("/delivery/**")
                                .uri("lb://delivery-service"))
                .route("storehouse-service",
                        r -> r.path("/storehouse/**")
                                .uri("lb://storehouse-service"))
                .route("provider-service",
                        r -> r.path("/provider/**")
                                .uri("lb://provider-service"))
                .build();

    }
}
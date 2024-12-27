package web.listener;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import web.dto.OrderDto;
import web.model.Delivery;
import web.service.DeliveryService;

@Component
@RequiredArgsConstructor
@Slf4j
public class OrderListener {

    private final DeliveryService deliveryService;

    @KafkaListener(topics = "${spring.kafka.topic.order}", groupId = "order_group")
    public void listenOrderTopic(OrderDto orderDto) {
        Delivery delivery = Delivery.builder()
                .merchId(orderDto.getId())
                .address(orderDto.getAddress())
                .build();

        log.info(delivery.toString());
        deliveryService.saveDelivery(delivery);
    }
}
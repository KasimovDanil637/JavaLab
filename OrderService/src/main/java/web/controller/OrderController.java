package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import web.accessors.DeliveryService;
import web.dto.OrderDto;
import web.dto.ResponseDto;
import web.accessors.StorehouseService;


@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final KafkaTemplate<String, OrderDto> kafkaTemplate;

    private final DeliveryService deliveryService;

    private final StorehouseService storehouseService;

    @Value("${spring.kafka.topic.order}")
    private String topic;

    @PostMapping("/send-delivery")
    public ResponseEntity<ResponseDto> postDelivery(final @RequestBody OrderDto dto) {
        storehouseService.checkMerchFromStorehouse(dto.getId());
        kafkaTemplate.send(topic, dto);
        return ResponseEntity.ok().body(ResponseDto.builder()
                .result("Товар отправлен в доставку.")
                .build());

    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getDelivery(final @PathVariable Long id) {
        return ResponseEntity.ok().body(ResponseDto.builder()
                .result(deliveryService.getDeliveryId(id).getResult())
                .build());
    }
}
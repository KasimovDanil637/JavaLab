package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.dto.ResponseDto;
import web.service.DeliveryService;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto> getDeliveryId(final @PathVariable Long id) {
        return ResponseEntity.ok().body(ResponseDto.builder()
                .result(deliveryService.findDeliveryById(id))
                .build());
    }
}

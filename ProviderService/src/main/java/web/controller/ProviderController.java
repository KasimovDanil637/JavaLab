package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.accessors.StorehouseService;
import web.dto.MerchDto;
import web.dto.ResponseDto;


@RestController
@RequestMapping("/provider")
@RequiredArgsConstructor
public class ProviderController {

    private final StorehouseService storehouseService;

    @PostMapping("/send-storehouse")
    public ResponseEntity<ResponseDto> sendStorehouse(final @RequestBody MerchDto merchDto) {
        return ResponseEntity.ok().body(ResponseDto.builder()
                .result("Товар добавлен. ID: " + storehouseService.addNewMerch(merchDto).getId())
                .build());
    }
}
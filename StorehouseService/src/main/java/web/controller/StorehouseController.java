package web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import web.dto.ResponseDto;
import web.dto.MerchDto;
import web.service.MerchService;

@RestController
@RequestMapping("/storehouse")
@RequiredArgsConstructor
public class StorehouseController {

    private final MerchService merchService;

    @PostMapping("/add")
    public ResponseEntity<ResponseDto> addMerch(final @RequestBody MerchDto merchDto) {
        return ResponseEntity.ok().body(ResponseDto.builder()
                .result("Товар добавлен. ID: " + merchService.saveMerch(merchDto.getName(), merchDto.getCount()))
                .build());
    }
}
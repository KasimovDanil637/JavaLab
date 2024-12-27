package web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import web.dto.ResponseDto;
import web.exception.DataNotFoundException;

@ControllerAdvice
@Slf4j
public class ExceptionHandlerController {

    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<ResponseDto> invalidDataException(DataNotFoundException e) {
        log.warn(e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ResponseDto
                .builder()
                .errorMessage(e.getMessage())
                .build());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseDto> exception(Exception ex) {
        log.error(String.valueOf(ex));
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ResponseDto
                .builder()
                .errorMessage("Произошла непредвиденная ошибка: " + ex.getMessage())
                .build());
    }
}
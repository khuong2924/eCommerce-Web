package com.khuong2924.apibanhang.exception;

import com.khuong2924.apibanhang.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    ResponseDTO<String> handleRuntimeException(RuntimeException e){
        return ResponseDTO.<String>builder()
                .status(400)
                .message(e.getMessage())
                .build();
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    ResponseDTO<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        return ResponseDTO.<String>builder()
                .status(400)
                .message(e.getFieldError().getDefaultMessage())
                .build();
    }

}

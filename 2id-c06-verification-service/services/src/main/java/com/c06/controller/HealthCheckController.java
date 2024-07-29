package com.c06.controller;

import com.c06.model.payload.response.GenericResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.c06.constant.AppConstant.SUCCESS_CODE;

@RestController
@RequestMapping(path = "api", produces = MediaType.APPLICATION_JSON_VALUE)
public class HealthCheckController {
    @GetMapping(value = {"/health"})
    public GenericResponse<String> health() {
        return new GenericResponse<>(SUCCESS_CODE, "v1.0.0");
    }
}

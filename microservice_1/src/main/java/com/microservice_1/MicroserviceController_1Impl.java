package com.microservice_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroserviceController_1Impl implements MicroserviceController_1 {


    @Override
    @GetMapping("/first")
    public String firstMethodMicroserviceFirst() {
        return new String("This is first method of microservice #1");
    }

    @Override
    @GetMapping("/parameter/{id}")
    public String secondMethodMicroserviceFirst(@PathVariable Integer id) {
        return String.format("This is second method of microservice #%s", id);
    }
}

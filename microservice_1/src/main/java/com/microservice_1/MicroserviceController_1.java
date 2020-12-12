package com.microservice_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface MicroserviceController_1 {

    @GetMapping("/first")
    String firstMethodMicroserviceFirst();

    @GetMapping("/parameter/{id}")
    String secondMethodMicroserviceFirst(@PathVariable(value = "id") String id);


}

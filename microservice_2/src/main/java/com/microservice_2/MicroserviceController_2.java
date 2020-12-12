package com.microservice_2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("microservice-1")
public interface MicroserviceController_2 {

    @GetMapping("/first")
    String firstMethodMicroserviceFirst();

    @GetMapping("/parameter/{id}")
    String secondMethodMicroserviceFirst(@PathVariable(value = "id") String id);


}

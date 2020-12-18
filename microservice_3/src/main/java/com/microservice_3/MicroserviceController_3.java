package com.microservice_3;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("microservice-2")
public interface MicroserviceController_3 {

    @GetMapping("/first")
    String asd();

    @GetMapping("/parameter/{id}")
    String secondMethodMicroserviceSecond(@PathVariable(value = "id") Integer id);


}

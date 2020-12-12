package com.microservice_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MicroserviceController_1Impl implements MicroserviceController_1{


    @Override
    @ResponseBody
    @GetMapping("/first")
    public String firstMethodMicroserviceFirst() {
        return new String("This is first method of microservice #1");
    }

    @Override
    @GetMapping("/parameter/{id}")
    public String secondMethodMicroserviceFirst(@PathVariable String id) {
        return String.format("This id first method of microservice #%s",id);
    }
}

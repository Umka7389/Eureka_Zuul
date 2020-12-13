package com.microservice_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MicroserviceController_3Impl {

    private MicroserviceController_3 microserviceController3;

    @Autowired
    public void setMicroserviceController_3(MicroserviceController_3 microserviceController3) {
        this.microserviceController3 = microserviceController3;
    }


    @GetMapping("/get_first")
    public String firstMethodMicroserviceThird(Model model) {
        String s = "This is first method of microservice #3\n" +
                microserviceController3.asd();
        model.addAttribute("firstMethodMicroserviceThird", s);
        return "greeting-view";
    }


    @GetMapping("/get_parameter/{id}")
    public String secondMethodMicroserviceThird(@PathVariable String id, Model model) {
        String s = String.format("This is second method of microservice #%s"
                + microserviceController3.secondMethodMicroserviceSecond(2), id);
        model.addAttribute("get_parameter", s);
        return "greeting-view";
    }
}

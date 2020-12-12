package com.microservice_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MicroserviceController_2Impl {

    private MicroserviceController_2 microserviceController2;

    @Autowired
    public void setMicroserviceController_2(MicroserviceController_2 microserviceController2) {
        this.microserviceController2 = microserviceController2;
    }

    @ResponseBody
    @GetMapping("/first")
    public String firstMethodMicroserviceSecond() {
        String s = "This is first method of microservice #2\n" +
                microserviceController2.firstMethodMicroserviceFirst();
        return s;
    }

    @GetMapping("/test")
    public String test(Model model) {
        String s = "This is first method of microservice #2\n" +
                microserviceController2.firstMethodMicroserviceFirst();
        model.addAttribute("test", s);
        return "greeting-view";
    }

    @GetMapping("/parameter/{id}")
    public String secondMethodMicroserviceSecond(@PathVariable String id) {
        return String.format("This id first method of microservice #%s", id);
    }
}

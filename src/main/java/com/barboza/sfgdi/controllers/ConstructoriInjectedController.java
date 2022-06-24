package com.barboza.sfgdi.controllers;

import com.barboza.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructoriInjectedController {
    private final GreetingService greetingService;


    public ConstructoriInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

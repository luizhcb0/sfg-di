package com.barboza.sfgdi.controllers;

import com.barboza.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructoriInjectedControllerTest {

    ConstructoriInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructoriInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
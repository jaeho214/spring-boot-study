package com.example.springbootstudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    EventService simpleEventService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
            simpleEventService.createEvent();
            simpleEventService.publishEvent();
            simpleEventService.deleteEvent();

    }
}

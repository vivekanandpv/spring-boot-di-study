package com.vivekanandpv.springbootdistudy.services;

import org.springframework.stereotype.Component;

@Component
public class SampleServiceImplementation implements SampleService {
    @Override
    public String getMessage() {
        return "SampleImplementation: Field Injection";
    }
}

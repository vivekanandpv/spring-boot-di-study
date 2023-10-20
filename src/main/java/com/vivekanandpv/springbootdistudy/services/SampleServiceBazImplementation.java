package com.vivekanandpv.springbootdistudy.services;

import org.springframework.stereotype.Component;

@Component("baz")
public class SampleServiceBazImplementation implements SampleService {
    @Override
    public String getMessage() {
        return "SampleImplementation: Baz";
    }
}

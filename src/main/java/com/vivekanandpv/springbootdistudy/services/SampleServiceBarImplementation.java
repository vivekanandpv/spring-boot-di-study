package com.vivekanandpv.springbootdistudy.services;

import org.springframework.stereotype.Component;

@Component("bar")
public class SampleServiceBarImplementation implements SampleService {
    @Override
    public String getMessage() {
        return "SampleImplementation: Bar";
    }
}

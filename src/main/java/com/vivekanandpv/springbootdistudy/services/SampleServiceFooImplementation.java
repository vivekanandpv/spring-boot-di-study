package com.vivekanandpv.springbootdistudy.services;

import org.springframework.stereotype.Component;

@Component("foo")
public class SampleServiceFooImplementation implements SampleService {
    @Override
    public String getMessage() {
        return "SampleImplementation: Foo";
    }
}


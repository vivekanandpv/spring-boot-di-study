package com.vivekanandpv.springbootdistudy.apis;

import com.vivekanandpv.springbootdistudy.services.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sample")
public class SampleApi {
    //  Field injection
    //  Not recommended
    //  Detailed explanation: https://www.springcloud.io/post/2022-08/spring-field-injection/#gsc.tab=0
    //  https://www.baeldung.com/java-spring-field-injection-cons
    @Autowired
    private SampleService service;

    @GetMapping
    public ResponseEntity<?> get() {
        return ResponseEntity.ok(service.getMessage());
    }
}

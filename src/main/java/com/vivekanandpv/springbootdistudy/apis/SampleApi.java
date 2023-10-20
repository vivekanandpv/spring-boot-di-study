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
    private SampleService service;

    //  Setter injection
    //  @Autowired is required
    //  Detailed explanation: https://spring.io/blog/2007/07/11/setter-injection-versus-constructor-injection-and-the-use-of-required
    @Autowired
    public void setService(SampleService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<?> get() {
        return ResponseEntity.ok(service.getMessage());
    }
}

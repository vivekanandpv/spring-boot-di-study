package com.vivekanandpv.springbootdistudy.apis;

import com.vivekanandpv.springbootdistudy.services.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sample")
public class SampleApi {

    //  Qualifier at the field level (@Autowired is required)
    //  @Autowired
    //  @Qualifier("foo")
    private SampleService service;

    //  Qualifier for the constructor is applied at the parameter level
    //  public SampleApi(@Qualifier("bar") SampleService service) {
    //      this.service = service;
    //  }


    //  @Qualifier is applied at the setter level
    @Autowired
    @Qualifier("baz")
    public void setService(SampleService service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity<?> get() {
        return ResponseEntity.ok(service.getMessage());
    }
}

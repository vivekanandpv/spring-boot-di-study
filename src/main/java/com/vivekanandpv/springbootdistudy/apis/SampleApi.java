package com.vivekanandpv.springbootdistudy.apis;

import com.vivekanandpv.springbootdistudy.services.SampleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/sample")
public class SampleApi {
    private final SampleService service;

    //  @Autowired is optional since Spring v4.3
    public SampleApi(SampleService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<?> get() {
        return ResponseEntity.ok(service.getMessage());
    }
}

package com.mycompany.myapp.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FooResource controller
 */
@RestController
@RequestMapping("/api/foo")
public class FooResource {

    private final Logger log = LoggerFactory.getLogger(FooResource.class);

    /**
     * POST create
     */
    @PostMapping("/create")
    public String create() {
        return "create";
    }

    /**
     * GET get
     */
    @GetMapping("/get")
    public String get() {
        return "get";
    }
}

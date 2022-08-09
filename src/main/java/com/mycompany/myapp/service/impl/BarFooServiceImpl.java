package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.service.BarFooService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BarFooServiceImpl implements BarFooService {

    private final Logger log = LoggerFactory.getLogger(BarFooServiceImpl.class);
}

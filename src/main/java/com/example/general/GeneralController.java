package com.example.general;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GeneralController {
    private GeneralMapper generalMapper;

    public GeneralController(GeneralMapper generalMapper) {
        this.generalMapper = generalMapper;
    }
    @GetMapping("/generals")
    public List<General> getGenerals() {
        return generalMapper.findAll();
    }
}

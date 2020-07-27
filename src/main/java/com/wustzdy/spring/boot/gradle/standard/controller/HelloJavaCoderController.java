package com.wustzdy.spring.boot.gradle.standard.controller;

import com.wustzdy.spring.boot.gradle.standard.service.I18nServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api")
public class HelloJavaCoderController {
    @Autowired
    private I18nServiceImpl i18nService;

    @GetMapping("/i18n/standard")
    public ResponseEntity greeting() {
        return ResponseEntity.ok(i18nService.getMessage("message.key.hello", new Object[]{"JavaCoder"}));
    }

    @GetMapping("/standard")
    public ResponseEntity test() {
        return ResponseEntity.ok(i18nService.getMessage("message.key.test"));
    }

}

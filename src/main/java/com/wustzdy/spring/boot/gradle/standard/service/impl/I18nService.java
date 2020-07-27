package com.wustzdy.spring.boot.gradle.standard.service.impl;


public interface I18nService {

    public String getMessage(String msgKey, Object[] args);

    public String getMessage(String msgKey);
}

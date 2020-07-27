package com.wustzdy.spring.boot.gradle.standard.service;

import com.wustzdy.spring.boot.gradle.standard.service.impl.I18nService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;

public class I18nServiceImpl implements I18nService {

    @Autowired
    private MessageSource messageSource;

    public I18nServiceImpl(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public String getMessage(String msgKey, Object[] args) {
        return messageSource.getMessage(msgKey, args, LocaleContextHolder.getLocale());
    }

    public String getMessage(String msgKey) {
        return messageSource.getMessage(msgKey, null, LocaleContextHolder.getLocale());
    }
}

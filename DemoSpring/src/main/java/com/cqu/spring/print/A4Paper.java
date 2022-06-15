package com.cqu.spring.print;

import org.springframework.stereotype.Component;

@Component
public class A4Paper implements Paper {
    public String getSize() {
        return "A4";
    }
}

package com.cqu.spring.print;

import org.springframework.stereotype.Component;

@Component
public class B5Paper implements Paper {
    public String getSize() {
        return "B5";
    }
}

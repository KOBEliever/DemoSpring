package com.cqu.spring.print;

import org.springframework.stereotype.Component;

@Component
public class ColorBox implements Box {
    public String getColor() {
        return "彩色";
    }
}

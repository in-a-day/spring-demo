package com.example.classpath.metadata;

import lombok.Data;

@Data
public class MeBean {
    private String str;
    public MeBean(String str) {
        this.str = str;
    }
}

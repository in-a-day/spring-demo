package com.example.classpath.metadata;

import lombok.Data;

@Data
public class MeBean2 {
    private String str;
    public MeBean2(String str) {
        this.str = str;
    }
}

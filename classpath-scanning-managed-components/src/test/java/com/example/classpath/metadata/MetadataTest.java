package com.example.classpath.metadata;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MetadataTest {
    @Autowired
    private MeBean meBean;

    @Test
    public void testMeBean() {
        System.out.println(meBean);
    }
}

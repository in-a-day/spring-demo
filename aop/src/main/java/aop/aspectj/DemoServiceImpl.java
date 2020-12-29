package aop.aspectj;

import org.springframework.stereotype.Component;

@Component
public class DemoServiceImpl implements DemoService {
    @Override
    public void hello() {
        System.out.println("hello aop!");
    }
}

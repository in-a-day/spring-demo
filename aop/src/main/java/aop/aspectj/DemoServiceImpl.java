package aop.aspectj;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DemoServiceImpl implements DemoService {
    @Override
    public void hello() {
        log.info("==> hello aop!");
    }

    @Override
    public int exec() {
        return 0;
    }

    @Override
    public void bye() throws Exception{
        log.info("==> bye!");
    }
}

package com.example.configuration.required;

import com.example.configuration.beans.CommonBean;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;


/**
 * `@Required注解`  注解属性必须在配置时就填充, 如果属性未填充抛出异常 <br>
 * spring 5.1废弃  <br>
 * 建议在bean中直接判断(eg.在init方法中判断) <br>
 * 推荐使用constructor注入 <br>
 * TODO 使用InitializingBean.afterPropertiesSet()  <br>
 * @author zbs
 */
@Component
@ToString
public class RequiredAnnotation {
    @Autowired
    private CommonBean commonBean;

    @Required
    public void setCommonBean(CommonBean commonBean) throws Exception {
        if (commonBean == null) throw new Exception();
        this.commonBean = commonBean;
    }

    public CommonBean getCommonBean() {
        return commonBean;
    }
}


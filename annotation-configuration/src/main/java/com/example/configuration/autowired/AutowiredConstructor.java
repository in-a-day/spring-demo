package com.example.configuration.autowired;

import com.example.configuration.beans.CommonBean;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zbs
 */

@Data
@Component
public class AutowiredConstructor {
    private CommonBean commonBean;
    private List<String> stringList;
    private List<CommonBean> commonBeanList;


    /**
     * 私有构造方法亦可以自动注入  <br>
     * 无法自动注入的属性为空, 即默认stringList: []
     *
     * @param commonBean
     * @param stringList
     * @param commonBeanList
     */
    private AutowiredConstructor(CommonBean commonBean, List<String> stringList,
                                List<CommonBean> commonBeanList) {
        this.commonBean = commonBean;
        this.stringList = stringList;
        this.commonBeanList = commonBeanList;
    }
}

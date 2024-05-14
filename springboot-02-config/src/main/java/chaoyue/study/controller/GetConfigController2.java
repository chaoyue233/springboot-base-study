package chaoyue.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用Environment对象获取配置
 */
@RestController
public class GetConfigController2 {
    @Autowired
    private Environment environment;

    @GetMapping("getConfig2")
    public String getConfig() {
        String name = environment.getProperty("person.name");
        System.out.println(name);
        return name;
    }
}

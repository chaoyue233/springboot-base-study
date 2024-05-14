package chaoyue.study.controller;

import chaoyue.study.config.PersonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用配置映射对象的方式获取配置信息
 */
@RestController
public class GetConfigController3 {
    @Autowired
    private PersonConfig personConfig;

    @GetMapping("getConfig3")
    public PersonConfig getConfig() {
        return personConfig;
    }
}

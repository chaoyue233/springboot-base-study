package chaoyue.study.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用@Value注解获取配置
 */
@RestController
public class GetConfigController1 {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private Integer age;
    @Value("${address1[0]}")
    private String address1;
    @Value("${address2[1]}")
    private String address2;
    @Value("${myname}")
    private String myName;
    @Value("${msg1}")
    private String msg1;
    @Value("${msg2}")
    private String msg2;

    @GetMapping("getConfig1")
    public String getConfig() {
        return String.format("name: %s, age: %d, address1: %s, address2: %s, myname: %s",
                name, age, address1, address2, myName);
    }

    @GetMapping("msg1")
    public String msg1() {
        System.out.println(msg1);
        return msg1;
    }

    @GetMapping("msg2")
    public String msg2() {
        System.out.println(msg2);
        return msg2;
    }

}

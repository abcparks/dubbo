package cn.alex.dubbo.access;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by WCY on 2022/10/21
 */
@EnableDubbo(scanBasePackages = "cn.alex.dubbo.access")
@ImportResource("classpath:config/dubbo-config.xml")
@SpringBootApplication
public class AccessApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccessApplication.class, args);
    }
}

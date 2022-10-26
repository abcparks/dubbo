package cn.alex.dubbo.provider2;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by WCY on 2022/10/21
 */
@EnableDubbo(scanBasePackages = "cn.alex.dubbo.provider2.service")
@ImportResource("classpath:config/dubbo-config.xml")
@SpringBootApplication
public class Provider2Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider2Application.class, args);
    }
}

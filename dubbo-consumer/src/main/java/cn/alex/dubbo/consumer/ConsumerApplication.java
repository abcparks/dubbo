package cn.alex.dubbo.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by WCY on 2022/10/21
 */
@EnableDubbo(scanBasePackages = "cn.alex.dubbo.consumer")
@ImportResource("classpath:config/dubbo-config.xml")
@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}

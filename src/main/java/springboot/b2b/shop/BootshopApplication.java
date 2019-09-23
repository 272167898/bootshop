package springboot.b2b.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"springboot.b2b.shop"})
@MapperScan("springboot.b2b.shop.dao")
public class BootshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootshopApplication.class, args);
    }

}

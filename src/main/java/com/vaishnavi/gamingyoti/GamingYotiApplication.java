package com.vaishnavi.gamingyoti;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.vaishnavi.gamingyoti.config.YotiProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigurationProperties(YotiProperties.class)
public class GamingYotiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamingYotiApplication.class, args);
    }

}

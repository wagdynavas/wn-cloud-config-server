package com.wagdynavas.wncloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class WnCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WnCloudConfigServerApplication.class, args);
    }

}

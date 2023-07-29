package vip.freeb.auth.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringOauth2ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringOauth2ClientApplication.class, args);
    }

}

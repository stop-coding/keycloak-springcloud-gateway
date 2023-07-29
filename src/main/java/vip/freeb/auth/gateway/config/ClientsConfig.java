package vip.freeb.auth.gateway.config;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix="spring.security.oauth2.client")
@Configuration
public class ClientsConfig {
  private Map<String, Object> registration;

  public Map<String, Object> getRegistration() {
      return this.registration;
  }

  public void setRegistration(Map<String, Object> registration) {
    this.registration = registration;
}
}

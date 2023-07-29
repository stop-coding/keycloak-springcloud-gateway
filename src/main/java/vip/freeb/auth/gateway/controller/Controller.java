package vip.freeb.auth.gateway.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vip.freeb.auth.gateway.config.ClientsConfig;


@RestController
public class Controller {

    @Autowired
    private ClientsConfig clientsConfig;

    @GetMapping("/user")
    public Map<String, Object> index(@AuthenticationPrincipal OAuth2User principal) {
        return Collections.singletonMap("name", principal.getAttribute("preferred_username"));
    }

    @GetMapping("/reg")
	public Map<String, Object> getRegistration() {
        Map<String, Object> reg = this.clientsConfig.getRegistration();
        if (reg == null) {
            return Collections.singletonMap("id", "none");
        }
        Map<String, Object> maps = new HashMap<>();
        reg.forEach((k,v)->{
            maps.put(k, v);
        });
		
		return maps;
	}
}
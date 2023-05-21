package ma.banque.app.controller;

import lombok.AllArgsConstructor;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@AllArgsConstructor
public class AuthController {
    private JwtEncoder jwtEncoder;

    @PostMapping(value = "/token")
    public Map<String, String> jwtToken(){
        return null;
    }
}

package fun.williamcolton.kite.controller;

import fun.williamcolton.kite.dto.auth.LoginDto;
import fun.williamcolton.kite.dto.auth.LoginResponseDto;
import fun.williamcolton.kite.dto.auth.RegisterDto;
import fun.williamcolton.kite.dto.auth.RegisterResponseDto;
import fun.williamcolton.kite.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginDto dto) {
        LoginResponseDto resp = authService.login(dto);
        return ResponseEntity.ok(resp);
    }

    @PostMapping("/register")
    public ResponseEntity<RegisterResponseDto> register(@RequestBody RegisterDto dto) {
        RegisterResponseDto resp = authService.register(dto);
        return ResponseEntity.ok(resp);
    }

    @PostMapping("/logout")
    public void logout() {
    }
}

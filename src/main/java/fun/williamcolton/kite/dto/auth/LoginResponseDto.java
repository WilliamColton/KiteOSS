package fun.williamcolton.kite.dto.auth;

import lombok.Data;

@Data
public class LoginResponseDto {
    private String id;
    private String username;
    private String email;
}

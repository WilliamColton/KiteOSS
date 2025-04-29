package fun.williamcolton.kite.dto.auth;

import lombok.Data;

@Data
public class RegisterResponseDto {
    private String id;
    private String username;
    private String email;
}

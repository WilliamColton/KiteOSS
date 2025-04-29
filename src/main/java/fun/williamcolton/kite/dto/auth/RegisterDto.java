package fun.williamcolton.kite.dto.auth;

import lombok.Data;

@Data
public class RegisterDto {
    public String username;
    public String password;
    public String email;
}

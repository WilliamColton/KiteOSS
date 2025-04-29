package fun.williamcolton.kite.service;

import com.baomidou.mybatisplus.extension.service.IService;
import fun.williamcolton.kite.dto.auth.LoginDto;
import fun.williamcolton.kite.dto.auth.LoginResponseDto;
import fun.williamcolton.kite.dto.auth.RegisterDto;
import fun.williamcolton.kite.dto.auth.RegisterResponseDto;
import fun.williamcolton.kite.entity.User;

public interface AuthService extends IService<User> {
    LoginResponseDto login(LoginDto loginDto);

    RegisterResponseDto register(RegisterDto registerDto);
}

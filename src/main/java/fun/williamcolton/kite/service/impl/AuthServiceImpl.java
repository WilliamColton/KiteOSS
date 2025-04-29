package fun.williamcolton.kite.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.williamcolton.kite.dto.auth.LoginDto;
import fun.williamcolton.kite.dto.auth.LoginResponseDto;
import fun.williamcolton.kite.dto.auth.RegisterDto;
import fun.williamcolton.kite.dto.auth.RegisterResponseDto;
import fun.williamcolton.kite.entity.User;
import fun.williamcolton.kite.mapper.UserMapper;
import fun.williamcolton.kite.service.AuthService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl extends ServiceImpl<UserMapper, User> implements AuthService {

    private final ModelMapper modelMapper;

    public AuthServiceImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public LoginResponseDto login(LoginDto dto) {
        User user = getOne(new QueryWrapper<User>().eq("username", dto.getUsername()));
        if (user.getPasswordHash().equals(dto.getPassword())) {
            return modelMapper.map(user, LoginResponseDto.class);
        }
        return null;
    }

    @Override
    public RegisterResponseDto register(RegisterDto dto) {
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPasswordHash(dto.getPassword());
        save(user);
        return modelMapper.map(user, RegisterResponseDto.class);
    }
}

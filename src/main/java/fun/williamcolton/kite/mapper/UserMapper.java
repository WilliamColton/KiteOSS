package fun.williamcolton.kite.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import fun.williamcolton.kite.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}

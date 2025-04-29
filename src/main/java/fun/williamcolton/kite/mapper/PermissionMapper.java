package fun.williamcolton.kite.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import fun.williamcolton.kite.entity.Permission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {
}

package fun.williamcolton.kite.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import fun.williamcolton.kite.entity.File;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FileMapper extends BaseMapper<File> {
}

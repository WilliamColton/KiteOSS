package fun.williamcolton.kite.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("folder")
public class Folder {

    @TableId(type = IdType.ASSIGN_UUID)
    private String id;

    private String parentId;          // 根目录 0

    private String name;

    private LocalDateTime deletedAt;

    private LocalDateTime createdAt;

}

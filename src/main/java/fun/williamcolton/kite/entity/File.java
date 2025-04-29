package fun.williamcolton.kite.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("file")
public class File {

    @TableId(type = IdType.AUTO)
    private String id;

    private String folderId;
    private String name;
    private Long size;
    private String mime;
    private String cosKey;
    private String md5;
    private LocalDateTime deletedAt;
    private LocalDateTime createdAt;
    
}

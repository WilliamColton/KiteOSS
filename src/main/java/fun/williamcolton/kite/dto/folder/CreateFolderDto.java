package fun.williamcolton.kite.dto.folder;

import lombok.Data;

@Data
public class CreateFolderDto {
    private String name;
    private String parentId; // 根目录传 null
    // private Long ownerId;  // 临时由前端传入，后面换成从 token 里取
}

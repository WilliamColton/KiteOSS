package fun.williamcolton.kite.dto.folder;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FolderDto {

    private String id;
    private String name;
    private Long parentFolderId;
    // private Long ownerId;
    private LocalDateTime createdAt;

}
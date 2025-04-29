package fun.williamcolton.kite.dto.file;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FileDto {

    private String id;
    private String name;
    private String folderId;
    private String mime;
    private Long size;
    private LocalDateTime createdAt;
    
}

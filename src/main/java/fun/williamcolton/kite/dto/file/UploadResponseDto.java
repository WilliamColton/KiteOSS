package fun.williamcolton.kite.dto.file;

import lombok.Data;

@Data
public class UploadResponseDto {
    private String id;
    private String fileName;
    private String mime;
    private Long size;
}

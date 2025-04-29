package fun.williamcolton.kite.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import fun.williamcolton.kite.dto.file.FileDto;
import fun.williamcolton.kite.entity.File;
import org.springframework.web.multipart.MultipartFile;

public interface FileService extends IService<File> {
    IPage<FileDto> list(String folderId, long page, long size);

    FileDto getFile(String fileId);

    void uploadFile(MultipartFile file) throws Exception;

    void prepare()
}

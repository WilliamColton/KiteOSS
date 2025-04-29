package fun.williamcolton.kite.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.model.ObjectMetadata;
import fun.williamcolton.kite.dto.file.FileDto;
import fun.williamcolton.kite.entity.File;
import fun.williamcolton.kite.mapper.FileMapper;
import fun.williamcolton.kite.service.FileService;
import org.apache.commons.io.FilenameUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements FileService {

    private final COSClient cosClient;
    private final ModelMapper modelMapper;
    private final String bucket;

    public FileServiceImpl(COSClient cosClient, ModelMapper modelMapper, @Value("${tencent.cos.bucket}") String bucket) {
        this.cosClient = cosClient;
        this.modelMapper = modelMapper;
        this.bucket = bucket;
    }

    @Override
    public IPage<FileDto> list(String folderId, long page, long size) {
        return null;
    }

    @Override
    public FileDto getFile(String fileId) {
        return null;
    }

    @Override
    public void uploadFile(MultipartFile file) throws IOException {

        /* 1. 生成对象 Key */
        String ext = FilenameUtils.getExtension(file.getOriginalFilename());
        String fileId = UUID.randomUUID().toString().replace("-", "");
        String month = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM"));
        String key = String.format("user/%s/%s/%s.%s", "userid", month, fileId, ext);

        /* 2. 上传 COS */
        ObjectMetadata meta = new ObjectMetadata();
        meta.setContentType(file.getContentType());
        meta.setContentLength(file.getSize());
        cosClient.putObject(bucket, key, file.getInputStream(), meta);

        /*

        // 3. 保存数据库
        File entity = new File();
        entity.setId(fileId);
        entity.setFolderId(folderId);
        entity.setUserId(userId);
        entity.setName(file.getOriginalFilename());
        entity.setSize(file.getSize());
        entity.setMime(file.getContentType());
        entity.setCosKey(key);
        entity.setMd5(DigestUtils.md5Hex(file.getInputStream()));
        fileMapper.insert(entity);

        */

        /* 4. 返回 DTO */
        // return new FileDto(fileId, folderId, entity.getName(), entity.getSize(),
        //        entity.getMime(), entity.getCreatedAt());

    }

}

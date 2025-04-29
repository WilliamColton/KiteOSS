package fun.williamcolton.kite.service;

import com.baomidou.mybatisplus.extension.service.IService;
import fun.williamcolton.kite.dto.folder.CreateFolderDto;
import fun.williamcolton.kite.dto.folder.FolderDto;
import fun.williamcolton.kite.entity.Folder;

import java.util.List;

public interface FolderService extends IService<Folder> {

    List<FolderDto> listByParent(String parentId);

    FolderDto create(CreateFolderDto createFolderDto);

    FolderDto rename(String id, String newName);

    FolderDto move(String id, String targetParentId);

    void delete(String id);

}

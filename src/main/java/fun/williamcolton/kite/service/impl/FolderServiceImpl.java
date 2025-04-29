package fun.williamcolton.kite.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.williamcolton.kite.dto.folder.CreateFolderDto;
import fun.williamcolton.kite.dto.folder.FolderDto;
import fun.williamcolton.kite.entity.Folder;
import fun.williamcolton.kite.mapper.FolderMapper;
import fun.williamcolton.kite.service.FolderService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FolderServiceImpl extends ServiceImpl<FolderMapper, Folder> implements FolderService {

    private final ModelMapper modelMapper;

    public FolderServiceImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }


    @Override
    public List<FolderDto> listByParent(String parentId) {
        return list(new QueryWrapper<Folder>().eq("parent_id", parentId)).stream().map(f -> modelMapper.map(f, FolderDto.class)).collect(Collectors.toList());
    }

    @Override
    public FolderDto create(CreateFolderDto createFolderDto) {
        Folder folder = modelMapper.map(createFolderDto, Folder.class);
        save(folder);
        return modelMapper.map(folder, FolderDto.class);
    }

    @Override
    public FolderDto rename(String id, String newName) {
        return null;
    }

    @Override
    public FolderDto move(String id, String targetParentId) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}

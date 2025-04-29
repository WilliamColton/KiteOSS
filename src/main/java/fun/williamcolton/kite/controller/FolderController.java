package fun.williamcolton.kite.controller;

import fun.williamcolton.kite.dto.folder.CreateFolderDto;
import fun.williamcolton.kite.dto.folder.FolderDto;
import fun.williamcolton.kite.entity.Folder;
import fun.williamcolton.kite.service.FolderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/folder")
class FolderController {

    private final FolderService folderService;

    public FolderController(FolderService folderService) {
        this.folderService = folderService;
    }

    @GetMapping
    public List<FolderDto> list(String parentId) {
        return folderService.listByParent(parentId);
    }

    @PostMapping
    public FolderDto createFolder(@RequestBody CreateFolderDto dto) {
        return folderService.create(dto);
    }

    @DeleteMapping
    public void deleteFolder(@RequestBody Folder folder) {
    }

    @PatchMapping
    public void renameFolder(@RequestBody Folder folder) {
    }

}

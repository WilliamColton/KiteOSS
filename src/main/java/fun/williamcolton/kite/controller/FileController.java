package fun.williamcolton.kite.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import fun.williamcolton.kite.dto.file.FileDto;
import fun.williamcolton.kite.service.FileService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/files")
class FileController {

    private final FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    // ---- Metadata ----
    @GetMapping
    public IPage<FileDto> listFiles(@RequestParam String folderId, @RequestParam(defaultValue = "1") long page, @RequestParam(defaultValue = "20") long size) {
        return fileService.list(folderId, page, size);
    }

    @GetMapping("/{id}")
    public void getFile(@PathVariable int id) {
    }

    @PutMapping("/{id}")
    public void renameFile(@PathVariable int id) {
    }

    @PatchMapping("/{id}/move")
    public void moveFile(@PathVariable int id) {
    }

    @DeleteMapping("/{id}")
    public void deleteFile(@PathVariable int id) {
    }

    // ---- Data ops ----
    @PostMapping("/upload")
    public void uploadFile(@RequestParam("file") MultipartFile file) throws Exception {
        fileService.uploadFile(file);
    }

    @PostMapping("/downloadFile")
    public void downloadFile(@RequestParam("file") MultipartFile file) {
    }
}

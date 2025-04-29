package fun.williamcolton.kite.controller;

import fun.williamcolton.kite.entity.Share;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/shares")
class ShareController {

    @PostMapping
    public void createShare(@RequestBody Share share) {
    }

    @GetMapping("/{code}")
    public void accessShare(@PathVariable String code) {
    }

    @DeleteMapping("/{id}")
    public void deleteShare(@PathVariable String id) {
    }
}

package com.Project.University.Management.System.controller;

import com.Project.University.Management.System.entity.Notice;
import com.Project.University.Management.System.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notices")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @PostMapping
    public Notice create(@RequestBody Notice notice){
        return noticeService.create(notice);
    }

    @GetMapping
    public List<Notice> getAll(){
        return noticeService.getAll();
    }

    @GetMapping("/{id}")
    public Notice get(@PathVariable int id){
        return noticeService.get(id);
    }

    @PutMapping("/{id}")
    public Notice update(@PathVariable int id, @RequestBody Notice notice){
        return noticeService.update(id,notice);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        noticeService.delete(id);
    }
}

package com.Project.University.Management.System.controller;

import com.Project.University.Management.System.entity.LibraryBook;
import com.Project.University.Management.System.service.LibraryBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/librarybooks")
public class LibraryBookController {

    @Autowired
    private LibraryBookService libraryBookService;

    @PostMapping
    public LibraryBook create(@RequestBody LibraryBook libraryBook){
        return libraryBookService.create(libraryBook);
    }

    @GetMapping
    public List<LibraryBook> getAll(){
        return libraryBookService.getAll();
    }

    @GetMapping("/{id}")
    public LibraryBook get(@PathVariable int id){
        return libraryBookService.get(id);
    }

    @PutMapping("/{id}")
    public LibraryBook update(@PathVariable int id, @RequestBody LibraryBook libraryBook){
        return libraryBookService.update(id, libraryBook);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        libraryBookService.delete(id);
    }



}

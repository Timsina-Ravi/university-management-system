package com.Project.University.Management.System.controller;

import com.Project.University.Management.System.entity.Professor;
import com.Project.University.Management.System.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/professors")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @PostMapping()
    public Professor create(@RequestBody Professor professor) {
        return professorService.create(professor);
    }

    @GetMapping()
    public List<Professor> getAll() {
        return professorService.getAll();
    }

    @GetMapping("/{id}")
    public Professor get(@PathVariable int id) {
        return professorService.get(id);
    }

    @PutMapping("/{id}")
    public Professor update(@PathVariable int id, @RequestBody Professor professor) {
        return professorService.update( id, professor);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        professorService.delete(id);
    }
}

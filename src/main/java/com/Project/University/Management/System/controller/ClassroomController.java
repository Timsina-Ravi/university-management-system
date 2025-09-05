package com.Project.University.Management.System.controller;
import com.Project.University.Management.System.entity.Classroom;
import com.Project.University.Management.System.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/classrooms")
public class ClassroomController {

    @Autowired
    private ClassroomService classroomService;

    @PostMapping
    public Classroom create(@RequestBody Classroom classroom){
        return classroomService.create(classroom);
    }

    @GetMapping
    public List<Classroom> getAll(){
        return classroomService.getAll();
    }

    @GetMapping("/{id}")
    public Classroom get(@PathVariable int id){
        return classroomService.get(id);
    }

    @PutMapping("/{id}")
    public Classroom update(@PathVariable int id, @RequestBody Classroom classroom){
        return classroomService.update(id, classroom);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        classroomService.delete(id);
    }
}

package com.Project.University.Management.System.controller;
import com.Project.University.Management.System.entity.Course;
import com.Project.University.Management.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping()
    public Course create(@RequestBody Course course){
        return courseService.create(course);
    }

    @GetMapping()
    public List<Course> getAll(){
        return courseService.getAll();
    }

    @GetMapping("/{id}")
    public Course get(@PathVariable Long id){
        return courseService.get(id);
    }

    @PutMapping("/{id}")
    public Course update(@PathVariable Long id , @RequestBody Course course){
        return courseService.update(id,course);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        courseService.delete(id);
    }

}

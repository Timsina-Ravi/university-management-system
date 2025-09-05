package com.Project.University.Management.System.service;

import com.Project.University.Management.System.entity.Course;
import com.Project.University.Management.System.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course create(Course course){
       return courseRepository.save(course);
    }

    public List<Course> getAll(){
        return courseRepository.findAll();
    }

    public Course get(Long id){
        return courseRepository.findById(id).orElse(null);
    }

    public Course update(Long id, Course course){
        course.setId(id);
        return courseRepository.save(course);
    }

    public void delete(Long id){
        courseRepository.deleteById(id);
    }
}

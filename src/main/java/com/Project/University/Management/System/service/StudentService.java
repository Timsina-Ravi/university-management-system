package com.Project.University.Management.System.service;

import com.Project.University.Management.System.entity.Student;
import com.Project.University.Management.System.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student create(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Student get(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student update(Long id, Student student) {
        student.setId(id);
        return studentRepository.save(student);
    }

    public void delete(Long id) {
        studentRepository.deleteById(id);
    }


}

package com.Project.University.Management.System.service;

import com.Project.University.Management.System.entity.Classroom;
import com.Project.University.Management.System.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService {

    @Autowired
    private ClassroomRepository classroomRepository;

    public Classroom create(Classroom classroom){
        return classroomRepository.save(classroom);
    }

    public List<Classroom> getAll(){
        return classroomRepository.findAll();
    }

    public Classroom get(int id){
        return classroomRepository.findById(id).orElse(null);
    }

    public Classroom update(int id, Classroom classroom){
        classroom.setId(id);
        return classroomRepository.save(classroom);
    }

    public void delete(int id){
        classroomRepository.deleteById(id);
    }

}

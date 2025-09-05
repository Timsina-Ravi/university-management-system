package com.Project.University.Management.System.service;

import com.Project.University.Management.System.entity.Professor;
import com.Project.University.Management.System.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    public Professor create(Professor professor) {
        return professorRepository.save(professor);
    }

    public Professor get(int id) {
        return professorRepository.findById(id).orElse(null);
    }

    public List<Professor> getAll() {
        return professorRepository.findAll();
    }

    public Professor update(int id, Professor professor) {
        professor.setId(id);
        return professorRepository.save(professor);
    }

    public void delete(int id) {
        professorRepository.deleteById(id);
    }


}

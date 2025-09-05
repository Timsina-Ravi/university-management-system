package com.Project.University.Management.System.service;
import com.Project.University.Management.System.entity.LibraryBook;
import com.Project.University.Management.System.repository.LibraryBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibraryBookService {

    @Autowired
    public LibraryBookRepository libraryBookRepository;

    public LibraryBook create(LibraryBook libraryBook){
        return libraryBookRepository.save(libraryBook);
    }

    public List<LibraryBook> getAll(){
        return libraryBookRepository.findAll();
    }

    public LibraryBook get(int id){
        return libraryBookRepository.findById(id).orElse(null);
    }

    public LibraryBook update(int id, LibraryBook libraryBook){
        libraryBook.setId(id);
        return libraryBookRepository.save(libraryBook);
    }

    public void delete(int id){
        libraryBookRepository.deleteById(id);
    }





}

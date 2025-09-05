package com.Project.University.Management.System.service;

import com.Project.University.Management.System.entity.Notice;
import com.Project.University.Management.System.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {


    @Autowired
    private NoticeRepository noticeRepository;

    public Notice create(Notice notice){
        return noticeRepository.save(notice);
    }

    public List<Notice> getAll(){
        return noticeRepository.findAll();
    }

    public Notice get(int id){
        return noticeRepository.findById(id).orElse(null);
    }

    public Notice update(int id, Notice notice){
        notice.setId(id);
        return noticeRepository.save(notice);
    }

    public void delete(int id){
        noticeRepository.deleteById(id);
    }

}

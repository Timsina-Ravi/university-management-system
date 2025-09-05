package com.Project.University.Management.System.service;

import com.Project.University.Management.System.entity.Event;
import com.Project.University.Management.System.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Event create(Event event){
        return eventRepository.save(event);
    }

    public List<Event> getAll(){
        return eventRepository.findAll();
    }

    public Event get(int id){
        return eventRepository.findById(id).orElse(null);
    }

    public Event update(int id, Event event){
        event.setId(id);
        return eventRepository.save(event);
    }

    public void delete(int id){
        eventRepository.deleteById(id);
    }

}

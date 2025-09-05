package com.Project.University.Management.System.controller;

import com.Project.University.Management.System.entity.Event;
import com.Project.University.Management.System.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping
    public Event create(@RequestBody Event event){
        return eventService.create(event);
    }

    @GetMapping
    public List<Event> getAll(){
        return eventService.getAll();
    }

    @GetMapping("/{id}")
    public Event get(@PathVariable int id){
        return eventService.get(id);
    }

    @PutMapping("/{id}")
    public Event update(@PathVariable int id, @RequestBody Event event){
        return eventService.update(id, event);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        eventService.delete(id);
    }
}

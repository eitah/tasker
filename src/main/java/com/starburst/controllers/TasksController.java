package com.starburst.controllers;

import com.starburst.models.Task;
import com.starburst.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/tasks"))
public class TasksController {

    private TaskRepository repo;

    @Autowired
    public void setRepo(TaskRepository repo) {
        this.repo = repo;
    }

    @RequestMapping(path = {"", "/"}, method = RequestMethod.GET)
    public Iterable<Task> index(){
        PageRequest pr = new PageRequest(0, 3); //starting at 0 paged by 3
        return repo.findAll(pr);
  }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Task show(@PathVariable int id){
        Task t = repo.findOne(id);
        return t;
    }


}

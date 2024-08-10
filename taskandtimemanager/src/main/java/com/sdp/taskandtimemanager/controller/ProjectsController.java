package com.sdp.taskandtimemanager.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdp.taskandtimemanager.model.Projects;
import com.sdp.taskandtimemanager.service.ProjectsService;


@RestController
@RequestMapping("/projects")
public class ProjectsController {
    @Autowired
    private ProjectsService service;

    @GetMapping("/findAll")
    public List<Projects> findAll() {
        return service.findAllProjects();
    }
    @GetMapping("/findById/{projectId}")
    public Projects findById(@PathVariable Long projectId){
        return service.findProjectById(projectId);
    }
    @PostMapping("/add")
    public String add(@RequestBody Projects project) {
        return service.addProject(project);
    }
    // @PostMapping("/add/{managerId}")
    // public Projects add(@RequestBody Projects project , @PathVariable Long managerId) {
    //     return service.addProject(project,managerId);
    // }
    @PutMapping("/update/{projectId}")
    public Projects update(@PathVariable Long projectId, @RequestBody Projects project) {
        return service.updateProject(projectId,project);
    }

    @PatchMapping("/updateSpecific/{projectId}")
    public Projects patch(@PathVariable Long projectId, @RequestBody Projects project){
        return service.patchProject(projectId, project);
    }

    @DeleteMapping("delete/{projectId}")
    public void delete(@PathVariable Long projectId) {
        service.deleteProject(projectId);
    }

}

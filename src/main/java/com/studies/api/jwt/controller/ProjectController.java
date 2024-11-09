package com.studies.api.jwt.controller;

import com.studies.api.jwt.entity.Project;
import com.studies.api.jwt.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping("/all")
    public Iterable<Project> getAllProjects() {
        return projectService.getAllProjects();
    }
    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable(value = "id") Long id) {
        return projectService.getProjectById(id);
    }
    @GetMapping("/user/{id}")
    public Iterable<Project> getAllProjectsByUserId(@PathVariable(value = "id") Long id) {
        return projectService.getAllProjectsByUserId(id);
    }

    @PostMapping("/create")
    public Project createProject(@RequestBody Project project) {
        return projectService.createProject(project);
    }
    @PutMapping("/update/{id}")
    public Project updateProject(@PathVariable(value = "id") Long id, @RequestBody Project project) {
        return projectService.updateProject(project);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteProject(@PathVariable(value = "id") Long id) {
        projectService.deleteProject(id);
    }

}

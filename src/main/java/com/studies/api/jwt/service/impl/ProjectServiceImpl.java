package com.studies.api.jwt.service.impl;

import com.studies.api.jwt.entity.Project;
import com.studies.api.jwt.repository.ProjectRepository;
import com.studies.api.jwt.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository repo;

    @Override
    public Iterable<Project> getAllProjects() {
        return repo.findAll();
    }

    @Override
    public Iterable<Project> getAllProjectsByUserId(Long id) {
        return repo.findAllByUserId(id);
    }

    @Override
    public Project getProjectById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public Project createProject(Project project) {
        return repo.save(project);
    }

    @Override
    public Project updateProject(Project project) {
        return repo.save(project);
    }

    @Override
    public void deleteProject(Long id) {
        repo.deleteById(id);
    }
}

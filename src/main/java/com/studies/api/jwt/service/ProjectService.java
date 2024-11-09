package com.studies.api.jwt.service;

import com.studies.api.jwt.entity.Donation;
import com.studies.api.jwt.entity.Project;
import org.springframework.stereotype.Service;

@Service
public interface ProjectService {

    Iterable<Project> getAllProjects();

    Iterable<Project> getAllProjectsByUserId(Long id);

    Project getProjectById(Long id);

    Project createProject(Project project);

    Project updateProject(Project project);

    void deleteProject(Long id);

}
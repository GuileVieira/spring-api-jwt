package com.studies.api.jwt.repository;

import com.studies.api.jwt.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

   Iterable<Project> findAllByUserId(Long id);

}

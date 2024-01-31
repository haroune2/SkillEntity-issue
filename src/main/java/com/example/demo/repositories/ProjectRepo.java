package com.example.demo.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.ProjectEntity;
import com.example.demo.entities.SkillEntity;

 public interface ProjectRepo extends JpaRepository<ProjectEntity, Integer> {
  
    List<ProjectEntity> findBySkills(SkillEntity skill);


}

 
 
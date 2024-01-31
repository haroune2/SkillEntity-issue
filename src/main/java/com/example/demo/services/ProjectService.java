package com.example.demo.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.ProjectEntity;
import com.example.demo.entities.SkillEntity;
import com.example.demo.repositories.ProjectRepo;
import com.example.demo.repositories.SkillRepository;

@Service
public class ProjectService {

    private final ProjectRepo ProjectRepo;
    private final SkillRepository skillRepository;
    

    @Autowired
    public ProjectService(ProjectRepo ProjectRepo,SkillRepository skillRepository) {
        this.ProjectRepo = ProjectRepo;
        this.skillRepository = skillRepository;
    }

    public List<ProjectEntity> getAllProjectBySkills(Integer skillsId) {
        Optional<SkillEntity> skillOptional = skillRepository.findById(skillsId); 

        if (skillOptional.isPresent()) {
            return ProjectRepo.findBySkills(skillOptional.get());
        } else {
            // Handle the case when the skill is not found (return an empty list or throw an exception)
            return Collections.emptyList(); // or throw new SkillNotFoundException("Skill not found with id: " + skillsId);
        }
    }
    

}

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.ProjectEntity;
import com.example.demo.entities.SkillEntity;
import com.example.demo.services.ProjectService;

@RestController
public class ProjectController {
    @Autowired
    private ProjectService projectService;


    @GetMapping("projects/{skillsId}")
    public ResponseEntity<List<ProjectEntity>> getcustom(@PathVariable Integer skillsId) {
         return ResponseEntity.ofNullable( projectService.getAllProjectBySkills(skillsId));

    }
 



}
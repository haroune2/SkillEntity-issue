package com.example.demo.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
public class SkillEntity {
    @Id
    @GeneratedValue
    private int Skill_id;

    private String  name;

    @ManyToMany(mappedBy = "skills")
    private Set<ProjectEntity> assignedProjects = new HashSet<>();
 
}

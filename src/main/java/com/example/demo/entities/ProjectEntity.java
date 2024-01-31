package com.example.demo.entities;

import java.util.HashSet;
import java.util.Locale.Category;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
public class ProjectEntity {
    @Id
    @GeneratedValue
    private int Project_id;


    private String  name;


    private String about;

    private String link_image;




    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "project_skill", joinColumns = @JoinColumn(name = "Project_id"), inverseJoinColumns = @JoinColumn(name = "Skill_id"))

    private Set<SkillEntity> skills = new HashSet<>();


}

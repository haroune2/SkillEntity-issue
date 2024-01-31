# Projet de Démo Spring Boot avec ManyToMany Relationship

Ce projet de démonstration Spring Boot illustre la résolution d'un problème rencontré sur Stack Overflow. La problématique initiale était liée à la récupération d'éléments à partir d'une table de jointure avec une relation ManyToMany.

Lien vers la question Stack Overflow: [How to fetch elements from a joint table with ManyToMany relation](https://stackoverflow.com/questions/77915838/how-to-fetch-elements-from-a-joint-table-with-manytomany-relation)

## Objectif

L'objectif de ce projet est de démontrer comment utiliser la relation ManyToMany avec Spring Data JPA pour récupérer des éléments à partir d'une table de jointure.

## Fonctionnalités du Projet

1. **Récupération de Projets par Compétence**: Une API REST est exposée pour récupérer des projets en fonction d'une compétence spécifique.

2. **Utilisation de Spring Data JPA**: Le projet utilise Spring Data JPA pour simplifier l'accès aux données et les opérations de requête.

## Comment Tester

1. Cloner le projet localement.
   ```bash
   git clone   https://github.com/haroune2/SkillEntity-issue

2 .Configuration de la Base de Données
      Assurez-vous d'ajouter les détails de votre base de données dans le fichier `src/main/resources/application.properties` avant de lancer l'application.

2.  Exécuter l'application Spring Boot.
    ```bash
    ./mvnw spring-boot:run


4.  Accéder à l'API pour récupérer des projets par compétence. Remplacez {skillsId} par l'ID de la compétence souhaitée.
   ```bash
     http://localhost:8080/projects/{skillsId}

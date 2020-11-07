package com.example.pamera.start.dao;

import com.example.pamera.start.model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface projectsRepository extends JpaRepository<Projects,Long> {

}

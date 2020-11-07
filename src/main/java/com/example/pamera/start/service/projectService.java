package com.example.pamera.start.service;

import com.example.pamera.start.model.Projects;

import java.util.List;

public interface projectService {
    List<Projects> SaveAll();

    Projects save(Projects project);

    Projects update(Long id);

    Projects delete(Long id);
}

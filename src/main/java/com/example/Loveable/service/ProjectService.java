package com.example.Loveable.service;

import com.example.Loveable.dto.project.ProjectRequest;
import com.example.Loveable.dto.project.ProjectResponse;
import com.example.Loveable.dto.project.ProjectSummaryResponse;

import java.util.List;

public interface ProjectService {

    List<ProjectSummaryResponse> getUserProjects(Long userId);
    ProjectResponse getUserProjectById(Long id, Long userId);
    ProjectResponse createProject(ProjectRequest request, Long userId);
    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);
    void softDelete(Long id, Long userId);
}

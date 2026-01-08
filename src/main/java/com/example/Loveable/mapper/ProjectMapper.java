package com.example.Loveable.mapper;

import com.example.Loveable.dto.project.ProjectResponse;
import com.example.Loveable.dto.project.ProjectSummaryResponse;
import com.example.Loveable.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
    ProjectResponse toProjectResponse(Project project);
    @Mapping(target = "projectName",source = "name")
    ProjectSummaryResponse toProjectSummaryResponse(Project project);
    List<ProjectSummaryResponse>toListOfProjectSummaryResponse(List<Project>projects);

}
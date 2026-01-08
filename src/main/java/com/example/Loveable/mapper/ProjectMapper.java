package com.example.Loveable.mapper;

import com.example.Loveable.dto.project.ProjectResponse;
import com.example.Loveable.entity.Project;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
    ProjectResponse toProjectResponse(Project project);

}

package com.example.Loveable.controller;

import com.example.Loveable.dto.project.ProjectRequest;
import com.example.Loveable.dto.project.ProjectResponse;
import com.example.Loveable.dto.project.ProjectSummaryResponse;
import com.example.Loveable.service.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@AllArgsConstructor
public class ProjectController {
    private final ProjectService projectService;

    @GetMapping//get all projects of the auth user
    public ResponseEntity<List<ProjectSummaryResponse>>getMyProjects(){
        Long userId=1L;
        return ResponseEntity.ok(projectService.getUserProjects(userId));
    }

    @GetMapping("/{Id}")
    public  ResponseEntity<ProjectResponse>getProjectById(@PathVariable Long id){
      Long userId=1L;
      return ResponseEntity.ok(projectService.getUserProjectById(id,userId));
    }

    @PostMapping
    public ResponseEntity<ProjectResponse>createProject(@RequestBody ProjectRequest request){
        Long userId=1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(projectService.createProject(request,userId));
    }
    @PatchMapping("/{id}")
    public ResponseEntity<ProjectResponse>updateProject(@PathVariable Long id,@RequestBody ProjectRequest request){
        Long userId=1L;
        return ResponseEntity.ok(projectService.updateProject(id,request,userId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteProject(@PathVariable Long id){
        Long userId=1L;
        projectService.softDelete(id,userId);
        return ResponseEntity.noContent().build();
    }
}

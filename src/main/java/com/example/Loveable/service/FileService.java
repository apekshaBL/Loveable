package com.example.Loveable.service;

import com.example.Loveable.dto.project.FileContentResponse;
import com.example.Loveable.dto.project.FileNode;

import java.util.List;

public interface FileService {
    List<FileNode> getFileTree(Long projectId, Long userId);
    FileContentResponse getFileContent(Long projectId, String path, Long userId);
}

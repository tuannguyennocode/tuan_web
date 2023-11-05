package com.example.tuan_web.service;

import com.example.tuan_web.dto.ProductDTO;
import com.example.tuan_web.dto.TaskDTO;
import com.example.tuan_web.entity.TaskEntity;

import java.util.List;

public interface ITaskService {
    List<TaskEntity> getAllTask();
    TaskDTO save(TaskDTO taskDTO);
    void delete(Long id);
}

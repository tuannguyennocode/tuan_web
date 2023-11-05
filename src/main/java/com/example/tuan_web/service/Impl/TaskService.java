package com.example.tuan_web.service.Impl;

import com.example.tuan_web.converter.TaskConverter;
import com.example.tuan_web.dto.ProductDTO;
import com.example.tuan_web.dto.TaskDTO;
import com.example.tuan_web.entity.CategoryEntity;
import com.example.tuan_web.entity.ProductEntity;
import com.example.tuan_web.entity.TaskEntity;
import com.example.tuan_web.repository.ProductRepository;
import com.example.tuan_web.repository.TaskRepository;
import com.example.tuan_web.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class TaskService implements ITaskService {

    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private TaskConverter taskConverter;

    public List<TaskEntity> getAllTask() {
        List<TaskEntity> listTaskEntity = taskRepository.findAll();
        return listTaskEntity;
    }


    public TaskDTO save(TaskDTO taskDTO) {
        TaskEntity taskEntity = new TaskEntity();
        taskEntity = taskConverter.toEntity(taskDTO);
        taskRepository.save(taskEntity);
        return taskDTO;
    }

    public void delete(Long id) {
        taskRepository.deleteById(id);
    }
}

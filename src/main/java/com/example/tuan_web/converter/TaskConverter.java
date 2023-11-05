package com.example.tuan_web.converter;

import com.example.tuan_web.dto.CategoryDTO;
import com.example.tuan_web.dto.TaskDTO;
import com.example.tuan_web.entity.CategoryEntity;
import com.example.tuan_web.entity.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskConverter {
    public TaskEntity toEntity(TaskDTO dto){
        TaskEntity entity = new TaskEntity();
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        return entity;
    }
}

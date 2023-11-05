package com.example.tuan_web.api;

import java.util.List;

import com.example.tuan_web.dto.TaskDTO;
import com.example.tuan_web.entity.TaskEntity;
import com.example.tuan_web.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tuan_web.dto.ProductDTO;
import com.example.tuan_web.service.IProductService;

@RestController
public class TaskAPI {
    @Autowired
    private ITaskService taskService;

    @GetMapping(value = "/task")
    public List<TaskEntity> getAllTask() {
        return taskService.getAllTask();
    }

    @PostMapping(value = "/task")
    public TaskDTO create(@RequestBody TaskDTO model) {
        return taskService.save(model);
    }

    @PutMapping(value = "/task/{id}")
    public TaskDTO update(@RequestBody TaskDTO model, @PathVariable("id") long id) {
        model.setId(id);
        return taskService.save(model);
    }

    @DeleteMapping(value = "/task/{id}")
    @ResponseBody
    public ResponseEntity<String> delete(@PathVariable("id") long id) {
        taskService.delete(id);
        return ResponseEntity.ok("{\"status\": \"Delete Successful\"}");
    }
}

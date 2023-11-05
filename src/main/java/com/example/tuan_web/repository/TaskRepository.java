package com.example.tuan_web.repository;

import com.example.tuan_web.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TaskRepository extends JpaRepository<TaskEntity, Long>{

}

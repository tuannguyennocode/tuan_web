package com.example.tuan_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tuan_web.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Long>{
    CategoryEntity findOneById(Long id);
    CategoryEntity findOneByCode(String code);
}

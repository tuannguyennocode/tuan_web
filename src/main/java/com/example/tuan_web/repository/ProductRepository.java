package com.example.tuan_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tuan_web.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{
     ProductEntity findOneById(Long id);
}

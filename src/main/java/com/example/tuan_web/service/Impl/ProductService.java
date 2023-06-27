package com.example.tuan_web.service.Impl;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tuan_web.converter.ProductConverter;
import com.example.tuan_web.dto.ProductDTO;
import com.example.tuan_web.entity.CategoryEntity;
import com.example.tuan_web.entity.ProductEntity;
import com.example.tuan_web.repository.CategoryRepository;
import com.example.tuan_web.repository.ProductRepository;
import com.example.tuan_web.service.IProductService;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductConverter productConverter;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public List<ProductDTO> getAllProduct() {
        List<ProductDTO> listProductDTO = new ArrayList<>();
        List<ProductEntity> listProductEntity = productRepository.findAll();
        for(ProductEntity productEntity : listProductEntity){
            ProductDTO productDTO = productConverter.toDTO(productEntity);
            listProductDTO.add(productDTO);
        }
        return listProductDTO;
    }

    @Override
    public ProductDTO save(ProductDTO productDTO) {
        ProductEntity productEntity = new ProductEntity();
        if (productDTO.getId() != null) {
            ProductEntity oldProductEntity = productRepository.findOneById(productDTO.getId());
            productEntity = productConverter.toEntity(productDTO, oldProductEntity);
            productEntity.setUpdatedDate(sdf.format(Date.valueOf(LocalDate.now())));
        } else {
            productEntity = productConverter.toEntity(productDTO);
            productEntity.setCreatedDate(sdf.format(Date.valueOf(LocalDate.now())));
        }
        CategoryEntity categoryEntity = categoryRepository.findOneByCode(productDTO.getCategoryCode());
        productEntity.setCategory(categoryEntity);
        productEntity = productRepository.save(productEntity);
        return productConverter.toDTO(productEntity);
    }

    @Override
    public void delete(Long[] ids) {
        productRepository.deleteAllById(Arrays.asList(ids));
    }
}

package com.example.tuan_web.service;

import java.util.List;

import com.example.tuan_web.dto.ProductDTO;

public interface IProductService {
    List<ProductDTO> getAllProduct();
    ProductDTO save(ProductDTO productDTO);
    void delete(Long[] ids);
}

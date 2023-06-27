package com.example.tuan_web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.tuan_web.dto.CategoryDTO;
import com.example.tuan_web.service.ICategoryService;

@CrossOrigin
@RestController
public class CategoryAPI {
    @Autowired
    private ICategoryService categoryService;

    @GetMapping(value = "/category")
    public List<CategoryDTO> getAllCategory() {
        return categoryService.getAllCategory();
    }

    @PostMapping(value = "/category")
    public CategoryDTO create(@RequestBody CategoryDTO model) {
        return categoryService.save(model);
    }

    @PutMapping(value = "/category/{id}")
    public CategoryDTO update(@RequestBody CategoryDTO model, @PathVariable long id) {
        model.setId(id);
        return categoryService.save(model);
    }

    @DeleteMapping(value = "/category")
    public void delete(@RequestBody Long[] ids) {
        categoryService.delete(ids);
    }
}

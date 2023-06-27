package com.example.tuan_web.api;

import java.util.List;

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
public class ProductAPI {
	@Autowired
	private IProductService productService;

	@GetMapping(value = "/product")
	public List<ProductDTO> getAllProduct() {
		return productService.getAllProduct();
	}

	@PostMapping(value = "/product")
	public ProductDTO create(@RequestBody ProductDTO model) {
		return productService.save(model);
	}

	@PutMapping(value = "/product/{id}")
	public ProductDTO update(@RequestBody ProductDTO model, @PathVariable("id") long id) {
		model.setId(id);
		return productService.save(model);
	}

	@DeleteMapping(value = "/product")
	@ResponseBody
	public ResponseEntity<String> delete(@RequestBody Long[] ids) {
		productService.delete(ids);
		return ResponseEntity.ok("{\"status\": \"Delete Successful\"}");
	}
}

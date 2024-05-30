package com.exatip.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exatip.product.dto.ProductDTO;
import com.exatip.product.entity.Product;
import com.exatip.product.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	private static final Logger log = LoggerFactory.getLogger(ProductController.class);

	ProductService productService; // using constructor injection

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping
	public ResponseEntity<String> createProducts(@RequestBody List<ProductDTO> productDTO) {
		try {
			log.info("Inside ProductController createProducts method");
			return new ResponseEntity<>(productService.createProducts(productDTO), HttpStatus.OK);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			log.info("Exit ProductController createProducts method");
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/{productId}")
	public Product getById(@PathVariable Long productId) {
		return productService.getProduct(productId);
	}

	@GetMapping
	public List<Product> getProduct() {
		return productService.getProducts();
	}

	@PutMapping("/{productId}")
	public Product updateProduct(@RequestBody Product body, @PathVariable Long productId) {
		return productService.updateProduct(body, productId);
	}

	@DeleteMapping("/{productId}")
	public String deleteProduct(@PathVariable Long productId) {
		return productService.deleteProduct(productId);
	}

	@DeleteMapping
	public String deleteProducts() {
		return productService.deleteProducts();
	}
}

package com.exatip.product.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exatip.product.dto.ProductDTO;
import com.exatip.product.entity.Product;
import com.exatip.product.repository.ProductRepository;
import com.exatip.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private static final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Autowired
	ProductRepository productRepository;

	@Override
	public String createProducts(List<ProductDTO> productDTOs) {
		log.info("Inside createProduct method of ProductServiceImpl");

		List<Product> products = new ArrayList<>();
		for (ProductDTO productDTO : productDTOs) {
			Product product = new Product();
			product.setName(productDTO.getName());
			product.setPrice(productDTO.getPrice());
			product.setQuantity(productDTO.getQuantity());
			product.setDescription(productDTO.getDescription());
			products.add(product);
		}
		productRepository.saveAll(products);

		log.info("Exit createProducts method of ProductServiceImpl");
		return "Product(s) created Successfully...";
	}

	@Override
	public Product getProduct(Long productId) {
		log.info("Inside getProduct method of ProductServiceImpl");

		Product product1 = null;
		Optional<Product> product = productRepository.findById(productId);

		if (product.isPresent()) {
			product1 = product.get();
		}

		log.info("Exit getProduct method of ProductServiceImpl");
		return product1;
	}

	@Override
	public List<Product> getProducts() {
		log.info("Inside getProduct method of ProductServiceImpl");

		log.info("Exit getProduct method");
		return productRepository.findAll();
	}

	@Override
	public Product updateProduct(Product body, Long productId) {
		log.info("Inside updateProduct method of ProductServiceImpl");
		Optional<Product> product = productRepository.findById(productId);

		Product product1 = null;
		if (product.isPresent()) {
			product1 = product.get();
		}

		product1.setName(body.getName());
		product1.setPrice(body.getPrice());
		product1.setQuantity(body.getQuantity());
		product1.setDescription(body.getDescription());
		productRepository.save(product1);

		log.info("Exit updateProduct method of ProductServiceImpl");
		return product1;
	}

	@Override
	public String deleteProduct(Long productId) {
		Optional<Product> product = productRepository.findById(productId);

		Product product1 = null;
		if (product.isPresent()) {
			product1 = product.get();
		} else {
			return "Product with Id " + productId + " not present..";
		}

		String productName = product1.getName();
		productRepository.deleteById(productId);
		return "Product " + productName + " Deleted Successfully..";
	}

	@Override
	public String deleteProducts() {
		productRepository.deleteAll();
		return "Products Deleted Successfully..";
	}
}

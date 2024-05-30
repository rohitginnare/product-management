package com.exatip.product.service;

import java.util.List;

import com.exatip.product.dto.ProductDTO;
import com.exatip.product.entity.Product;

public interface ProductService {
	public String createProducts(List<ProductDTO> products);

	public Product getProduct(Long productId);

	public List<Product> getProducts();

	public Product updateProduct(Product body, Long productId);

	public String deleteProduct(Long productId);

	public String deleteProducts();
}

package com.onebil.fms.service;

import java.util.List;

import com.onebil.fms.dto.ProductDTO;

public interface ProductService {
	public ProductDTO addProduct(ProductDTO product);

	public ProductDTO UpdateProduct(ProductDTO product);

	public List<ProductDTO> getProduct(ProductDTO product);

	public ProductDTO deleteProduct(ProductDTO product);

	public List<ProductDTO> getAllProduct();

}

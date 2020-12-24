package com.onebil.fms.dao;

import java.util.List;

import com.onebil.fms.dto.ProductDTO;

public interface ProductDAO {

	public ProductDTO addProduct(ProductDTO product);

	public ProductDTO deleteProduct(ProductDTO product);

	public ProductDTO UpdateProduct(ProductDTO product);

	public List<ProductDTO> getProduct(ProductDTO product);

	public List<ProductDTO> getAllProduct();

}

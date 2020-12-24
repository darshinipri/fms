package com.onebil.fms.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.onebil.fms.dao.ProductDAO;
import com.onebil.fms.dto.ProductDTO;
import com.onebil.fms.exception.PricingException;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	public ProductDAO productdao;
	
	public void setProductDao(ProductDAO productdao) {
		this.productdao = productdao;
	}

	
	@Override
	public ProductDTO UpdateProduct(ProductDTO product) {
		ProductDTO updPro = productdao.UpdateProduct(product);
		if (updPro != null) {
			return updPro;

		} else {
			throw new PricingException("Unable to update the  Product or No matching record found for update");

		}
	}

	@Override
	public List<ProductDTO> getProduct(ProductDTO product) {
		List<ProductDTO> getPro = productdao.getProduct(product);
		if (getPro != null) {
			return getPro;

		} else {
			throw new PricingException("Unable to fetch the Product details or No matching data found to fetch");

		}
	
	}

	@Override
	public ProductDTO deleteProduct(ProductDTO product) {
		ProductDTO remPro = productdao.deleteProduct(product);
		if (remPro != null) {
			return remPro;
		} else {
			throw new PricingException("Unable to delete the Product or No matching data found to remove");

		}
	}

	@Override
	public ProductDTO addProduct(ProductDTO product) {
		ProductDTO addPro = productdao.addProduct(product);
		if (addPro != null) {
			return addPro;
		} else {
			throw new PricingException("Unable to add record or Record already exists");
		}

	}

	@Override
	public List<ProductDTO> getAllProduct() {
		List<ProductDTO> productlist = productdao.getAllProduct();
		if (!productlist.isEmpty()) {
			return productlist;
		} else {
			throw new PricingException("No products found or Unable to fetch all product please try after some time");
		}

	}

	
	

	
}

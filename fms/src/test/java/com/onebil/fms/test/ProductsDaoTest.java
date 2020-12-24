//package com.onebil.fms.test;
//
//import static org.junit.Assert.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import java.util.List;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import com.onebil.fms.entities.Product;
//import com.onebil.fms.service.ProductServiceImpl;
//import lombok.Data;
//
//@Data
//class ProductsDaoTest {
//
//	private ProductServiceImpl productservice;
//	private Product product;
//	
//	@BeforeEach
//	void setUp(){
//	productservice = new ProductServiceImpl();
//    productservice.setProductDao(new ProductDAOStub());
//	product = new Product();
//	product.setCompanyName("Airtel");
//	product.setProductName("Mobile Recharge");
//	product.setProductId(1);
//	}
//
//
//	@Test
//	void testAddProduct() {
//		Product pro = productservice.addProduct(product);
//		assertEquals(pro.getProductId(), product.getProductId());
//	}
//
//	@Test
//	void testDeleteProduct() {
//		Product pro = productservice.deleteProduct(product.getProductId());
//		assertEquals(pro.getProductId(), product.getProductId());
//		
//	}
//
//	@Test
//	void testUpdateProduct() {
//		Product pro = productservice.UpdateProduct(product);
//		assertEquals(pro.getProductId(), product.getProductId());
//	}
//
//	@Test
//	void testGetAllProduct() {
//		List<Product> productList = productservice.getAllProduct();
//		assertNotNull(productList);
//	}
//
//	@Test
//	void testGetProduct() {
//		Product pro = productservice.getProduct(product.getProductId());
//		assertEquals(pro.getProductId(), product.getProductId());
//	}
//
//}

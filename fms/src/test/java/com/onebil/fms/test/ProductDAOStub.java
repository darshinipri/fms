//package com.onebil.fms.test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.onebil.fms.dao.ProductDAO;
//import com.onebil.fms.entities.Product;
//
//import lombok.Data;
//
//@Data
//public class ProductDAOStub implements ProductDAO {
//
//	@Override
//	public Product addProduct(Product product) {
//		Product pro = new Product();
//		pro.setProductId(1);
//		pro.setProductName("Mobile Recharge");
//		pro.setCompanyName("Airtel");
//		return pro;
//	}
//
//	@Override
//	public Product deleteProduct(int productId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Product UpdateProduct(Product product) {
//		Product pro = new Product();
//		pro.setProductId(product.getProductId());
//		pro.setProductName("Broadband connection");
//		pro.setCompanyName("Airtel");
//		return pro;
//	}
//
//	@Override
//	public Product getProduct(int productId) {
//		Product pro = new Product();
//		pro.setProductId(1);
//		pro.setProductName("Broadband connection");
//		pro.setCompanyName("Airtel");
//		List<Product> pro1 = new ArrayList<>();
//		pro1.add(pro);
//		return (Product) pro1;
//
//	}
//
//	@Override
//	public List<Product> getAllProduct() {
//		Product pro = new Product();
//		pro.setProductId(1);
//		pro.setProductName("Broadband connection");
//		pro.setCompanyName("Airtel");
//		Product pro1 = new Product();
//		pro1.setProductId(2);
//		pro1.setProductName("car for rent");
//		pro1.setCompanyName("zoomcar");
//		List<Product> list = new ArrayList<>();
//		list.add(pro);
//		list.add(pro1);
//		return list;
//
//	}
//
//}

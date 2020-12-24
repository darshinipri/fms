package com.onebil.fms.dao;

import java.lang.reflect.Type;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.onebil.fms.dto.ProductDTO;
import com.onebil.fms.entities.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public ProductDTO addProduct(ProductDTO product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transcation = manager.getTransaction();
		transcation.begin();
		Product pro = new Product();
		BeanUtils.copyProperties(product, pro);
		manager.persist(pro);
		ProductDTO dto = new ProductDTO();
		BeanUtils.copyProperties(pro, dto);
		manager.getTransaction().commit();
		manager.close();
		return dto;
	}

	@Override
	public ProductDTO deleteProduct(ProductDTO product) {
		EntityManager manager = factory.createEntityManager();
		Product product1 = manager.find(Product.class, product.getProductId());
		manager.getTransaction().begin();
		if (product1 != null) {
			manager.remove(product1);
			manager.getTransaction().commit();
			manager.close();
			return product;
		} else {
			manager.close();
			factory.close();
			return null;
		}
	}

	@Override
	public ProductDTO UpdateProduct(ProductDTO product) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Product product1 = manager.find(Product.class, product.getProductId());
		BeanUtils.copyProperties(product, product1);
		ProductDTO dto = new ProductDTO();
		BeanUtils.copyProperties(product1, dto);
		manager.getTransaction().commit();
		manager.close();
		return dto;
	}

	@Override
	public List<ProductDTO> getProduct(ProductDTO product) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Product pro = new Product();
		BeanUtils.copyProperties(product, pro);
		TypedQuery<Product> query = manager.createQuery("FROM Product P where P.product=:value", Product.class);
		query.setParameter("value", pro);
		List<Product> output = query.getResultList();
		ModelMapper mapper = new ModelMapper();
		Type listType = new TypeToken<List<ProductDTO>>() {
		}.getType();
		List<ProductDTO> dto = mapper.map(output, listType);
		return dto;
	}

	@Override
	public List<ProductDTO> getAllProduct() {
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Product> query = manager.createQuery("FROM Product", Product.class);
		List<Product> products = query.getResultList();
		ModelMapper mapper = new ModelMapper();
		Type listType = new TypeToken<List<ProductDTO>>() {
		}.getType();
		List<ProductDTO> dto = mapper.map(products, listType);
		return dto;
	}

}

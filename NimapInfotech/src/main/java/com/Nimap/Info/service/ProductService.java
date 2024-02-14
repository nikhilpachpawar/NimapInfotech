package com.Nimap.Info.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Nimap.Info.model.Category;
import com.Nimap.Info.model.Product;
import com.Nimap.Info.repository.CategoryRepository;
import com.Nimap.Info.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	CategoryRepository CR;
	
	@Autowired
	ProductRepository PR;
	

	public List<Product> getallproducts(int page, int PageSize) {
		Pageable pageble=PageRequest.of(page, PageSize);
		Page<Product> pageproduct=PR.findAll(pageble);
		List<Product> productList=pageproduct.getContent();
		return productList;
	}


	public void deleteproduct(int productId) {
		PR.deleteById(productId);
		
	}


	public Product getproductByid(int productId) {
		
		return PR.findById(productId).get();
	}


	public Product saveOrupdate(Product product) {
		
		Category c=CR.findBycategoryid(product.getCategory().getCategoryid());
		product.setCategory(c);
		return PR.save(product);
	}

}

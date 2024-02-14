package com.Nimap.Info.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Nimap.Info.model.Category;
import com.Nimap.Info.repository.CategoryRepository;
import com.Nimap.Info.repository.ProductRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository CR;
	
	@Autowired
	ProductRepository PR;
	
	

	public List<Category> getallcategory(int page, int PageSize) {
		
		Pageable a=PageRequest.of(page, PageSize);
		Page<Category> PageCategory=CR.findAll(a);
		List<Category> CategoryList=PageCategory.getContent();
		return CategoryList;
	}



	public void deleateCategoryById(int categoryid) {
		CR.deleteById(categoryid);
		
	}



	public Category getcategoryByid(int categoryid) {
		
		return CR.findById(categoryid).get();
	}



	public void saveOrupdate(Category category) {
		CR.save(category);
		
	}
	
	

}

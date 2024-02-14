package com.Nimap.Info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Nimap.Info.model.Category;
import com.Nimap.Info.model.Product;
import com.Nimap.Info.service.CategoryService;
import com.Nimap.Info.service.ProductService;

@RestController
public class HomeController {
	
	@Autowired
	CategoryService CS;
	
	@Autowired
	ProductService PS;
	
	@GetMapping("/api/categories")
	public List<Category> getallcategory(@RequestParam (value = "page",defaultValue = "0",required = false)int page)
	{
	     return CS.getallcategory(page,1);
	}
	
	@DeleteMapping("/api/categories/{di}")
	public void deleateCategoryById(@PathVariable("di") int categoryid) {
		CS.deleateCategoryById(categoryid);
		
	}
	
	@GetMapping("/api/categories/{di}")
	public Category getcategory(@PathVariable("di") int categoryid) {
		return CS.getcategoryByid(categoryid);
		
	}
	@PutMapping("/api/categories/{di}")
	public void updateCategory(@RequestBody Category category){
	
		CS.saveOrupdate(category);
	}
	
	@PostMapping("/api/categories")
	public void saveCategories(@RequestBody Category category) {
		
		CS.saveOrupdate(category);
	}
	
	@GetMapping("/api/products")
	public List<Product> getallproduct(@RequestParam(value = "page",defaultValue = "0",required = false)Integer page){
		return PS.getallproducts(page,1);
	}
	
	@DeleteMapping("/api/products/{di}")
	public void deleteProduct(@PathVariable("di") int productid) {
		PS.deleteproduct(productid);
	
	}
	@GetMapping("/api/products/{di}")
	public Product getproduct(@PathVariable("di") int productid) {
		return PS.getproductByid(productid);
		
	}
	 
	@PutMapping("/api/products/{di}")
	public void updateproduct(@RequestBody Product product){
		PS.saveOrupdate(product);
	}
		
	@PostMapping("/api/products")
	public Product saveProducts(@RequestBody Product product) {
		return PS.saveOrupdate(product);
	}

}

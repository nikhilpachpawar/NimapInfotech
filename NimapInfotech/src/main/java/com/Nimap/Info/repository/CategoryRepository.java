package com.Nimap.Info.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Nimap.Info.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

	public Category findBycategoryid(int categoryid);

	

}

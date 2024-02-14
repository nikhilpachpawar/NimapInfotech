package com.Nimap.Info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Nimap.Info.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}

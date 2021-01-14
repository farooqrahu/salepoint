package com.pos.sale.point.repository;

import com.pos.sale.point.domain.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="products",path="products")
public interface ProductRepository extends JpaRepository<Products, Long> {
}

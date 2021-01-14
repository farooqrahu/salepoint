package com.pos.sale.point.repository;

import com.pos.sale.point.domain.Branch;
import com.pos.sale.point.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="cities",path="cities")
public interface CityRepository extends JpaRepository<City, Long> {

}

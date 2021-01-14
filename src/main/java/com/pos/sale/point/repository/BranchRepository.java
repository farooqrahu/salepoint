package com.pos.sale.point.repository;

import com.pos.sale.point.domain.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="branches",path="branches")
public interface BranchRepository extends JpaRepository<Branch, Long> {

}

package com.pos.sale.point.repository;

import com.pos.sale.point.domain.Role;
import com.pos.sale.point.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RoleRepository extends JpaRepository<Role, Long> {

}

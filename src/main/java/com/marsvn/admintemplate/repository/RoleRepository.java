package com.marsvn.admintemplate.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.Repository;

import com.marsvn.admintemplate.entity.Role;

public interface RoleRepository extends Repository<Role, Long> {
	public Page<Role> findByEnabledOrderByUpdatedOnDesc(boolean enabled);

}

package com.marsvn.admintemplate.web.service;

import com.marsvn.admintemplate.entity.Role;
import com.marsvn.admintemplate.web.support.JsonResponse;
import com.marsvn.admintemplate.web.support.Pagination;

public class RoleServiceImpl implements RoleService {

	@Override
	public JsonResponse<Pagination<Role>> getRoles(int offset, int length) {
		return null;
	}

}

package com.marsvn.admintemplate.web.service;

import com.marsvn.admintemplate.entity.Role;
import com.marsvn.admintemplate.web.support.JsonResponse;
import com.marsvn.admintemplate.web.support.Pagination;

public interface RoleService {
	public JsonResponse<Pagination<Role>> getRoles(int offset, int length);

}

package com.marsvn.admintemplate.web.support;

public enum Page {
	ROLE(1,  Permission.ALL, Permission.READ, Permission.READ_ALL, Permission.WRITE, Permission.DELETE),
	USER(2, Permission.ALL, Permission.READ, Permission.READ_ALL, Permission.WRITE, Permission.DELETE),
	;
	
	private final int id;
	private final Permission[] permissions;
	private Page(int id, Permission... permissions) {
		this.id = id;
		this.permissions = permissions;
	}
	
	public int getId() {
		return id;
	}
	
	public Permission[] getPermissions() {
		return permissions;
	}

}

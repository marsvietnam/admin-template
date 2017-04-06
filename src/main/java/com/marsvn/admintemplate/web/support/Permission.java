package com.marsvn.admintemplate.web.support;

public enum Permission {
	ALL(1),
	READ(2),
	READ_ALL(3),
	WRITE(4),
	DELETE(5),
	EXECUTOR(6),
	;
	
	private final int id;
	private Permission(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

}

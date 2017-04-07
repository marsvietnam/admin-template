package com.marsvn.admintemplate.web.support;

import java.util.List;

public class Pagination<T> {
	private int offset;
	private int length;
	private long count;
	private List<T> data;
	
	public Pagination() {
		
	}

	public Pagination(long count, List<T> data, int offset, int length) {
		super();
		this.count = count;
		this.data = data;
		this.offset = offset;
		this.length = length;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}

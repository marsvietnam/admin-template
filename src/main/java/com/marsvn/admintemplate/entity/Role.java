package com.marsvn.admintemplate.entity;

import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = Role_.TABLE_NAME)
public class Role {
	private int id;
	private String name;
	private String searchableName;
	private Boolean enabled;
	private String description;
	private Map<Integer, String> pages;
	
	public Role() {
		
	}

	public Role(int id, String name, String description, Map<Integer, String> pages) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.pages = pages;
	}

	@Id
	@Column(name = Role_.ID_COLUMN)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Column(name = Role_.NAME_COLUMN, length = 45, nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = Role_.SEARCHABLE_NAME_COLUMN, length = 45, nullable = false)
	public String getSearchableName() {
		return searchableName;
	}

	public void setSearchableName(String searchableName) {
		this.searchableName = searchableName;
	}

	@Column(name = Role_.ENABLED_COLUMN)
	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@Column(name = Role_.DESCRIPTION_COLUMN, length = 255)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/*@ElementCollection
	@CollectionTable(name = Role_.PAGES_TABLE, joinColumns = @JoinColumn(name = Role_.PAGES_TABLE_ROLE_ID))
	@Column(name = Role_.PAGES_TABLE_PAGE_ID)
	public List<Integer> getPages() {
		return pages;
	}*/
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	
	public Map<Integer, String> getPages() {
		return pages;
	}

	public void setPages(Map<Integer, String> pages) {
		this.pages = pages;
	}

}

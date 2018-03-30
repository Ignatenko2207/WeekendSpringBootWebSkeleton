package org.itstep.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpringPojo {

	@JsonProperty
	private Integer id;
	
	@JsonProperty
	private String name;
	
	@JsonProperty
	private Boolean condition;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getCondition() {
		return condition;
	}

	public void setCondition(Boolean condition) {
		this.condition = condition;
	}

	public SpringPojo(Integer id, String name, Boolean condition) {
		this.id = id;
		this.name = name;
		this.condition = condition;
	}
	
	
}

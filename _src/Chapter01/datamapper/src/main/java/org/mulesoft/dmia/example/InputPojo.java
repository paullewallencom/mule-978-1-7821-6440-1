/**
 * 
 */
package org.mulesoft.dmia.example;

/**
 * Sample file to represent a DataMapper input POJO.
 * @author mariano
 *
 */
public class InputPojo {

	private String description;
	private Integer id;
	private Long creationTimestamp;
	private String value1;
	private String value2;
	
	public InputPojo() {
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}
}

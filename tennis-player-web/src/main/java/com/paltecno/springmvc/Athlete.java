package com.paltecno.springmvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Athlete {
	private String firstName;
	
//	@NotEmpty(message = "This is a required field.")
	@NotNull(message = "This is a required field.")
	@Size(min=1, message = "This is a required field.")
	private String lastName;
	
	private String country;
    private String handedness;
    private String[] grandSlams;
    
	@NotNull(message = "This is a required field.")
    @Min(value=1, message="Value must be greater than or equal to 1.")
    @Max(value=100, message="Value must be less than or equal to 100.")
    private Integer rank;
    
	public Athlete() {

	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHandedness() {
		return handedness;
	}

	public void setHandedness(String handedness) {
		this.handedness = handedness;
	}

	public String[] getGrandSlams() {
		return grandSlams;
	}

	public void setGrandSlams(String[] grandSlams) {
		this.grandSlams = grandSlams;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}
}

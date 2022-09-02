package com.planetsofBrands.Entities;



import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data

public class Passenger {
	private Integer id;
	private String firstName;
	private String lastName;
	@JsonIgnore
	private String middlename;
	private String email;
	private String phoneNumber;

}

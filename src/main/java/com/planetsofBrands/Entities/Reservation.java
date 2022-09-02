package com.planetsofBrands.Entities;




import lombok.Data;

@Data

public class Reservation  {
	private Integer id;
	private Boolean CheckedIn;
	private Integer numberofBags;
	
	private Passenger passenger;
	
	private Flight flight;

}

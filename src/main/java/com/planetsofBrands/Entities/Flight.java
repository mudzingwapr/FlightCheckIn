package com.planetsofBrands.Entities;

import java.sql.Timestamp;
import java.util.Date;

import lombok.Data;
@Data

public class Flight {
	private Integer id;
	private String flightno;
	private String operatingAirline;
	private String departureCity;
	private String arrivalCity;
	private Date dateofDeparture;
	private Timestamp estimatedapartureTime;

}

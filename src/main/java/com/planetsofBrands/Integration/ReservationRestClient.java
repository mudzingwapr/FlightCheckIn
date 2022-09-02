package com.planetsofBrands.Integration;

import com.planetsofBrands.Entities.Reservation;
import com.planetsofBrands.Entities.UpdateReservation;

public interface ReservationRestClient {
	
	public Reservation findRseservation(Integer id) ;
		
	public Reservation updateReservation(UpdateReservation request);
	

}

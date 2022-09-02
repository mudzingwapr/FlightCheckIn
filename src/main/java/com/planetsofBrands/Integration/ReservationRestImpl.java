package com.planetsofBrands.Integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.planetsofBrands.Entities.Reservation;
import com.planetsofBrands.Entities.UpdateReservation;
@Component
public class ReservationRestImpl implements ReservationRestClient {
	
private static final String rest_Url="http://localhost:8099/reservations/";

	@Override
	public Reservation findRseservation(Integer id) {
		RestTemplate rest = new RestTemplate();
		Reservation reservation = rest.getForObject(rest_Url+id, Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(UpdateReservation request) {
		RestTemplate rs = new RestTemplate();
		Reservation updateReservation = rs.postForObject(rest_Url, request, Reservation.class);
		return updateReservation;
	}

}

package com.planetsofBrands.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.planetsofBrands.Entities.Reservation;
import com.planetsofBrands.Entities.UpdateReservation;
import com.planetsofBrands.Integration.ReservationRestClient;

@Controller
public class CheckInController {
	@Autowired
	private ReservationRestClient reservation;
	
	@GetMapping("/showChecking")
		public String showChecking() {
		return "startChecking";
	}
	
	@RequestMapping("/startChecking")
		public String startCheckin(@RequestParam("reservationId")Integer reservationId, ModelMap md) {
		 Reservation res=reservation.findRseservation(reservationId);
		 md.addAttribute("res",res);
		 return "displayReservation";
		
	}
	
	@RequestMapping("/completeCheckIn")
	public String completeCheckIn(@RequestParam("reservationId") Integer reservationId, @RequestParam("numberOfBags") Integer numberOfBags) {
		UpdateReservation updre = new UpdateReservation();
		updre.setId(reservationId);
		updre.setCheckIn(true);
		updre.setNumberOfBags(numberOfBags);
		reservation.updateReservation(updre);		
		return "CheckInConfirmation";
		
	}

}

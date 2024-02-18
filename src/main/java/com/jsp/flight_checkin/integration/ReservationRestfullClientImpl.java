package com.jsp.flight_checkin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.jsp.flight_checkin.integration.dto.Reservation;
import com.jsp.flight_checkin.integration.dto.ReservationUpdateRequest;

@Component
public class ReservationRestfullClientImpl implements ReservationRestfullClient {

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplete = new RestTemplate();
		Reservation reservation = restTemplete.getForObject("http://localhost:8080/flights/reservation/" + id,
				Reservation.class);
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject("http://localhost:8080/flights/reservation", request,
				Reservation.class);
		return reservation;
	}

}

package com.jsp.flight_checkin.integration;

import org.springframework.web.bind.annotation.RequestBody;

import com.jsp.flight_checkin.integration.dto.Reservation;
import com.jsp.flight_checkin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestfullClient {
	public Reservation findReservation(Long id);
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request);

}

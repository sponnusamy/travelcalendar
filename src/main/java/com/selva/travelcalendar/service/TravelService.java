package com.selva.travelcalendar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.selva.travelcalendar.model.Travel;
import com.selva.travelcalendar.repo.TravelRepository;

@Component
public class TravelService {
	@Autowired
	TravelRepository travelRepository;

	public List<Travel> getTravelByContactId(long contactId) {
		return null;
	}
}

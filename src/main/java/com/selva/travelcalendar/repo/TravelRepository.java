package com.selva.travelcalendar.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.selva.travelcalendar.model.Travel;

@Repository
public interface TravelRepository extends CrudRepository<Travel, Serializable> {

}

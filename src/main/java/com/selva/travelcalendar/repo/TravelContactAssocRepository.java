package com.selva.travelcalendar.repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.selva.travelcalendar.model.TravelContactAssoc;

@Repository
public interface TravelContactAssocRepository extends CrudRepository<TravelContactAssoc, Serializable> {

}

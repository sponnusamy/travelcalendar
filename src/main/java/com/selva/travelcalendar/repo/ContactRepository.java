package com.selva.travelcalendar.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.selva.travelcalendar.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long>  {

}

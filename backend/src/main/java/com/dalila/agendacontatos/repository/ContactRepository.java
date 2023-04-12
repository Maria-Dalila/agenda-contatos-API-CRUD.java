package com.dalila.agendacontatos.repository;

import com.dalila.agendacontatos.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Short> {

}

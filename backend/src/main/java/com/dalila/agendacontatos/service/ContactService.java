package com.dalila.agendacontatos.service;

import com.dalila.agendacontatos.domain.Contact;
import com.dalila.agendacontatos.exception.UserNotFoundException;
import com.dalila.agendacontatos.repository.ContactRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    public ContactRepository cr;

    public List<Contact> findAll(){
        List<Contact> result = cr.findAll();
        return result;
    }

    public Contact save(Contact contact){
        Contact retorno = cr.save(contact);
        return retorno;
    }

    public Contact update(Contact contact){
        return cr.save(contact);
    }

    public Contact findById(Short id){
        Optional<Contact> result = cr.findById(id);
        if(result.isEmpty()){
            throw new UserNotFoundException();
        }return result.get();
    }

    public Contact delete(Short id){
        Optional<Contact> deleted = cr.findById(id);
        if(deleted.isEmpty()){
            throw new UserNotFoundException();
        }cr.delete(deleted.get());
        return deleted.get();
    }



}

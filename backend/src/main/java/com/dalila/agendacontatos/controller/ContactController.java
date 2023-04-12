package com.dalila.agendacontatos.controller;

import com.dalila.agendacontatos.domain.Contact;
import com.dalila.agendacontatos.exception.UserNotFoundException;
import com.dalila.agendacontatos.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    @Autowired
    public ContactService contactService;

    @GetMapping()
    public List<Contact> findAll() {
        List<Contact> result = contactService.findAll();
        return result;
    }

    @PostMapping()
    public Contact insert(@RequestBody Contact contact) {
        return contactService.save(contact);

    }

    @PutMapping
    public Contact updated(@RequestBody Contact contact) {
        return contactService.update(contact);
    }

    @GetMapping("/{id}")
    public Contact findById(@PathVariable Short id) {
        try {
            Contact contact = contactService.findById(id);
            return contact;
        } catch (UserNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found.", e);
        }
    }

    @DeleteMapping("/{id}")
    public Contact delete(@PathVariable Short id) {
        try {
            Contact contact = contactService.delete(id);
            return contact;
        } catch (UserNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found, try again with another id.", e);
        }
    }
}
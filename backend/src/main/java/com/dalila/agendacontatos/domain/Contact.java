package com.dalila.agendacontatos.domain;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name= "tbl_contact")
public class Contact implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column (name ="id_contact")
    private Short id;
    @Column (name ="name_contact", length = 50, nullable = false)
    private String name;
    @Column (name ="fone_contact", length = 20, nullable = false)
    private String fone;
    @Column (name ="email_contact", length = 50, nullable = false)
    private String email;

    public Contact(){

    }

    public Contact(String name, String fone, String email, Short id) {
        this.name = name;
        this.fone = fone;
        this.email = email;
        this.id = id;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

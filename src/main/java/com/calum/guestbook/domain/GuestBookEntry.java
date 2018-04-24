package com.calum.guestbook.domain;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;


@Entity
public class GuestBookEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotEmpty
    private String user;
    @NotEmpty
    private String comment;

}

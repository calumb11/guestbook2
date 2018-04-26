package com.calum.guestbook.domain;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.repository.CrudRepository;


import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@EntityListeners(AuditingEntityListener.class)
@Table (name = "entries")
public class GuestBookEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "entry_id")
    private Integer id;

    @NotEmpty
    private String user;

    @NotEmpty
    private String comment;

    @CreatedDate
    @Column (name = "modified_date")
    private Date created;

    @LastModifiedDate
    @Column (name ="modified_date")
    private Date modified;



    public GuestBookEntry () {
    }

    public GuestBookEntry (String user, String comment) {
        this.user = user;
        this.comment = comment;
    }

    public GuestBookEntry (Integer id, String user, String comment) {
        this.id = id;
        this.user = user;
        this.comment = comment;
    }

    public Integer getId () {
        return id;
    }


    public void setId (Integer id) {
        this.id = id;
    }


    public String getUser() {
        return user;
    }

    public void setUser (String user) {
        this.user = user;
    }


    public String getComment() {
        return comment;
    }


    public void setComment(String comment) {
        this.comment = comment;
    }


    public Date getCreated () {
        return created;
    }

    public void setCreated (Date created) {
        this.created = created;
    }

    public Date getModified () {
        return modified;
    }

    public void setModified (Date modified) {
        this.modified = modified;
    }



    @Override
    public String toString () {
        return "GuestBookEntry{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", comment='" + comment + '\'' +
                ", created=" + created +
                ", modified=" + modified +
                '}';
    }
}

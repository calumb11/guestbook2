package com.calum.guestbook.controller;


import com.calum.guestbook.domain.GuestBookEntry;
import com.calum.guestbook.service.GuestBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GuestBookController {

    @GetMapping ("/")
    public List<GuestBookEntry> testMapping () {
        return guestBookService.findAllEntries();
    }

    @Autowired
    private GuestBookService guestBookService;

}


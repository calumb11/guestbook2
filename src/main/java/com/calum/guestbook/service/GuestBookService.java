package com.calum.guestbook.service;

import com.calum.guestbook.domain.GuestBookEntry;
import com.calum.guestbook.domain.GuestBookEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestBookService {

    @Autowired
    private GuestBookEntryRepository guestBookEntryRepository;

    public List <GuestBookEntry> findAllEntries () {
        return this.guestBookEntryRepository.findAll ();
    }

    public GuestBookEntry findGuestBookEntryById (Integer id) {
        return this.guestBookEntryRepository.findGuestBookEntryById (id);
    }

    public void deleteGuestBookEntryById (Integer id) {
        this.guestBookEntryRepository.delete (id);
    }

    public List <GuestBookEntry> findGuestBookEntryByUser (String user) {
        return this.guestBookEntryRepository.findGuestBookEntryByUser (user);
    }

    public void save (GuestBookEntry newEntry) {
        this.guestBookEntryRepository.save (newEntry);
    }
}

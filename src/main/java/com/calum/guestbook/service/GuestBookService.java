package com.calum.guestbook.service;

/*import antlr.StringUtils;*/
import com.calum.guestbook.domain.GuestBookEntry;
import com.calum.guestbook.domain.GuestBookEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class GuestBookService {

    @Autowired
    private GuestBookEntryRepository guestBookEntryRepository;

    public List<GuestBookEntry> findAllEntries() {
        return this.guestBookEntryRepository.findAll();
    }

    public GuestBookEntry findGuestBookEntryById(Integer id) {
        return this.guestBookEntryRepository.findGuestBookEntryById(id);
    }

    public void deleteGuestBookEntryById(Integer id) {
        this.guestBookEntryRepository.delete(id);
    }

    public List<GuestBookEntry> findGuestBookEntryByUser(String user) {
        return this.guestBookEntryRepository.findGuestBookEntryByUser(user);
    }

    public void save(GuestBookEntry newEntry) {
        this.guestBookEntryRepository.save(newEntry);
    }

}

    /*

    @Autowired
    private GuestBookEntryRepository guestBookEntryRepository;

    public List <GuestBookEntry> findAllEntries() {
        List <GuestBookEntry> entries = this.guestBookEntryRepository.findAll ();

    }


        /*for (GuestBookEntry e: entries) {
            if (StringUtils.containsAny (e.getComment (), "<>")) {
                e.setComment ("Redacted - HTML Content?");
            }
        }

        return entries;


   public void save (GuestBookEntry newEntry) {
        this.guestBookEntryRepository.save (newEntry);
    }

    public void delete (Integer id) {
        this.guestBookEntryRepository.delete (id);
    }

    public List GuestBookEntry findAllEntries () {
        return this.guestBookEntryRepository.findOne (Integer id);
    }

    public GuestBookEntry findGuestBookEntryById(Integer id) {
    }

    public void deleteGuestBookEntryById(Integer id) {
    }

    public List<GuestBookEntry> findGuestBookEntryByUser(String user) {
    }
}
*/
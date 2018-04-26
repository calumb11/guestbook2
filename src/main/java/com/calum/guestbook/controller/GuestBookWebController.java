/*package com.calum.guestbook.controller;

import com.calum.guestbook.domain.GuestBookEntry;
import com.calum.guestbook.service.GuestBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class GuestBookWebController {

    private static final String FORM_ENTRIES_ID = "entries";
    private static final String HOME_PAGE_REDIRECT = "redirect:/";

    private static final String GUESTBOOK_FORM = "guestbook_form";
    private static final String GUESTBOOK_FORM_EDIT = "edit_guestbook_form";

    @Autowired
    private GuestBookService guestBookService;

    @GetMapping (value = "/")
    public String displayGuestBook (Model model) {

        model.addAttribute (FORM_ENTRIES_ID, this.guestBookService.findAllEntries ());
        model.addAttribute ("newEntry", new GuestBookEntry());

        return GUESTBOOK_FORM;
    }

    @PostMapping(value = "/")
    public String addComment (Model model,
                              @Valid @ModelAttribute("newEntry") GuestBookEntry newEntry,
                              BindingResult bindingResult) {

        if (bindingResult.hasErrors ()) {
            model.addAttribute (FORM_ENTRIES_ID, this.guestBookService.findAllEntries ());

            return GUESTBOOK_FORM;
        }
        else {
            this.guestBookService.save(newEntry);

            return HOME_PAGE_REDIRECT;
        }
    }

    @GetMapping (value = "/delete/{id}")
    public String deleteComment (@PathVariable Integer id) {

        this.guestBookService.delete (id);

        return HOME_PAGE_REDIRECT;
    }

    @GetMapping (value = "update/{id}")
    public String editComment (Model model, @PathVariable Integer id) {

        model.addAttribute (FORM_ENTRIES_ID, this.guestBookService.findAllEntries ());
        model.addAttribute ("newEntry", this.guestBookService.findOne (id));

        return GUESTBOOK_FORM_EDIT;
    }

    @PostMapping (value = "update/{id}")
    public String saveComment (Model model,
                               @PathVariable Integer id,
                               @Valid @ModelAttribute ("newEntry") GuestBookEntry newEntry,
                               BindingResult bindingResult) {

        if (bindingResult.hasErrors ()) {
            model.addAttribute (FORM_ENTRIES_ID, this.guestBookService.findAllEntries ());

            return GUESTBOOK_FORM_EDIT;
        }
        else {
            GuestBookEntry current = this.guestBookService.findOne (id);

            current.setUser (newEntry.getUser ());
            current.setComment (newEntry.getComment ());

            this.guestBookService.save (current);

            return HOME_PAGE_REDIRECT;
        }
    }


}
*/
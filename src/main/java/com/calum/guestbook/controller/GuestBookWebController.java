package com.calum.guestbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GuestBookWebController {

    private static final String GUESTBOOK_TEMPLATE = "guestbook";

    @GetMapping ("/")
    public String displayGuestBook () {
        return GUESTBOOK_TEMPLATE;
    }
}

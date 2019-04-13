package test.orm.ormtest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import test.orm.ormtest.services.BookService;

@RestController
@RequestMapping(value = "/Orm")
public class WelcomeController {

    @RequestMapping(value = "/check/", method = RequestMethod.GET)
    public Object check() {
        return "Status: Successful!!!";
    }

    @Autowired
    BookService bookService;

    @RequestMapping(value = "/books/")
    public Object testBooks() {
        return bookService.list();
    }
}

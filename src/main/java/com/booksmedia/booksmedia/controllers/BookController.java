package com.booksmedia.booksmedia.controllers;

import com.booksmedia.booksmedia.models.Book;
import com.booksmedia.booksmedia.models.BookRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookRepo bookRepo;

    @GetMapping("/allBooks")
    public String allBooks(Model model){
        List<Book> books = bookRepo.findAll();

        model.addAttribute("books", books);

        return "books/allBooks";
    }

    @DeleteMapping("/{id}")
    public RedirectView deleteBook(
            @PathVariable long id
    ){
        bookRepo.deleteById(id);
        return new RedirectView("/allBooks");
    }
}

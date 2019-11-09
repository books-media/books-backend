package com.booksmedia.booksmedia.controllers;

import com.booksmedia.booksmedia.models.TvShow;
import com.booksmedia.booksmedia.models.TvShowRepo;
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
@RequestMapping("/shows")
public class TvShowController {

    @Autowired
    TvShowRepo tvShowRepo;

    @GetMapping("/allShows")
    public String allShows(Model model){
        List<TvShow> tvShows = tvShowRepo.findAll();

        model.addAttribute("shows", tvShows);

        return "shows/allShows";
    }

    @DeleteMapping("/{id}")
    public RedirectView deleteShow(
            @PathVariable long id
    ){
        tvShowRepo.deleteById(id);
        return new RedirectView("/allShows");
    }

}

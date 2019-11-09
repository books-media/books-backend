package com.booksmedia.booksmedia.controllers;

import com.booksmedia.booksmedia.models.Anime;
import com.booksmedia.booksmedia.models.AnimeRepo;
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
@RequestMapping("/anime")
public class AnimeController {

    @Autowired
    AnimeRepo animeRepo;

    @GetMapping("/allAnime")
    public String allAnime(Model model){
        List<Anime> anime = animeRepo.findAll();

        model.addAttribute("anime", anime);

        return "anime/allAnime";
    }

    @DeleteMapping("/{id}")
    public RedirectView deleteAnime(
            @PathVariable long id
    ){
        animeRepo.deleteById(id);
        return new RedirectView("/allAnime");
    }
}

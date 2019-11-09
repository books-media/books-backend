package com.booksmedia.booksmedia.controllers;

import com.booksmedia.booksmedia.models.Art;
import com.booksmedia.booksmedia.models.ArtRepo;
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
@RequestMapping("/art")
public class ArtController {

    @Autowired
    ArtRepo artRepo;

    @GetMapping("/allArt")
    public String allArt(Model model){
        List<Art> art = artRepo.findAll();

        model.addAttribute("art", art);

        return "art/allArt";
    }

    @DeleteMapping("/{id}")
    public RedirectView deleteArt(
            @PathVariable long id
    ){
        artRepo.deleteById(id);
        return new RedirectView("/allArt");
    }
}

package com.booksmedia.booksmedia.controllers;

import com.booksmedia.booksmedia.models.Series;
import com.booksmedia.booksmedia.models.SeriesRepo;
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
@RequestMapping("/series")
public class SeriesController {

    @Autowired
    SeriesRepo seriesRepo;

    @GetMapping("/allSeries")
    public String allSeries(Model model){
        List<Series> series = seriesRepo.findAll();

        model.addAttribute("series", series);

        return "series/allSeries";
    }

    @DeleteMapping("/{id}")
    public RedirectView deleteSeries(
            @PathVariable long id
    ){
        seriesRepo.deleteById(id);
        return new RedirectView("/allSeries");
    }

}

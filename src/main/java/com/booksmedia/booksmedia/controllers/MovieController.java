package com.booksmedia.booksmedia.controllers;

import com.booksmedia.booksmedia.models.Movie;
import com.booksmedia.booksmedia.models.MovieRepo;
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
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieRepo movieRepo;

    @GetMapping("/allMovies")
    public String allMovies(Model model){
        List<Movie> movies = movieRepo.findAll();

        model.addAttribute("movies", movies);

        return "movies/allMovies";
    }

    @DeleteMapping("/{id}")
    public RedirectView deleteMovie(
            @PathVariable long id
    ){
        movieRepo.deleteById(id);
        return new RedirectView("/allMovies");
    }
}

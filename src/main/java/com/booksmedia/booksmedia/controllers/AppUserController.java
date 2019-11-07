package com.booksmedia.booksmedia.controllers;

import com.booksmedia.booksmedia.models.AppUser;
import com.booksmedia.booksmedia.models.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Principal;
import java.util.ArrayList;

@Controller
@RequestMapping("/users")
public class AppUserController {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AppUserRepo appUserRepo;

    @PostMapping("/")
    public RedirectView createUser(String username, String password, String firstName, String lastName){
        AppUser newUser = new AppUser(username,
               passwordEncoder.encode(password),
                firstName,
                lastName);
        appUserRepo.save(newUser);
        Authentication authentication = new UsernamePasswordAuthenticationToken(newUser, null, new ArrayList<>());
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return new RedirectView("/");
    }

    @GetMapping("/{id}")
    public String getUserProfile(
            @PathVariable Long id,
            Principal p,
            Model m
    ){
        m.addAttribute("viewedUser", appUserRepo.findById(id));
        m.addAttribute("currentUser", p);

        //TODO: will have to look into how this will change for non Thymeleaf front end
        return "userProfile";
    }
}

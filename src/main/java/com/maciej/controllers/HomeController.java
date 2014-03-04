package com.maciej.controllers;

import com.maciej.dto.User;
import com.maciej.logic.SthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    private SthService sthService;

    @Autowired
    public HomeController(SthService sthService) {
        this.sthService = sthService;
    }

    @RequestMapping(value = {"/", "/home"})
    public String showHomePage(@RequestParam(value = "napis", required = false, defaultValue = "nic nie wpisales, dodaj do sciezki ?napis= --jakisTamNapis--")
                                   String napis, ModelMap model){
        model.addAttribute("tekst", sthService.serviceGetString());
        model.addAttribute("juzer", sthService.returnSomeUser());
        model.addAttribute("napisik", napis);
        return "home";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView displayForm(@ModelAttribute("atryb") User user){
        return new ModelAndView("formek");
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView add(@ModelAttribute("atryb") User user){
        //tu moze byc jakis service dla modelu
        return displayForm(user);
    }
}

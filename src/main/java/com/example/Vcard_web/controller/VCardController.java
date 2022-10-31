package com.example.Vcard_web.controller;

import com.example.Vcard_web.models.domain.VCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/card")
public class VCardController {
    @Autowired
    private VCard vcard;

    @GetMapping("/ver")
    public String index(Model model){
        model.addAttribute("card", vcard);
        model.addAttribute("titulo", "Card V");
        return "ver";
    }
}

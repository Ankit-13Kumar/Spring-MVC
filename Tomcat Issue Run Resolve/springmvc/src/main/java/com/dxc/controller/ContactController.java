package com.dxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {
@Autowired
    private UserService userService;

    /*for common we make seperate model*/
    @ModelAttribute
    public void commonDataForModel(Model m){
        m.addAttribute("Header","Learn Coding");
        m.addAttribute("Desc","Programmer");
    }

    @RequestMapping(value = "/contact", method= RequestMethod.GET)
    public String showForm(Model m){

        return "contact";
    }

    //requestparam is using for fetching data from form

    @RequestMapping(value = "/processform",method=RequestMethod.POST)

            public String handleForm(@ModelAttribute("user") User user, Model model){

        System.out.println(user);
        this.userService.createUser(user);

        return "success";
    }
}

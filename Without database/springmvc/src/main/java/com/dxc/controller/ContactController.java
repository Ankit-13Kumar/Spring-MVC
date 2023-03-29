package com.dxc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ContactController {

    /*for common we make seperate model*/
    @ModelAttribute
    public void commonDataForModel(Model m){
        m.addAttribute("Header","Learn Coding");
        m.addAttribute("Desc","Programmer");
    }

    @RequestMapping(value = "/contact", method= RequestMethod.GET)
    public String showForm(Model m){
       /* m.addAttribute("Header","Learn Coding");
        m.addAttribute("Desc","Programmer");*/
        return "contact";
    }

    //requestparam is using for fetching data from form
    @RequestMapping(value = "/processform",method=RequestMethod.POST)
    /*public String handleForm(@RequestParam("email") String userEmail,
                                @RequestParam("userName") String userName,
                             @RequestParam("password") String userPassword, Model model){*/
            public String handleForm(@ModelAttribute User user, Model model){
        /*model.addAttribute("Header","Learn Coding");
        model.addAttribute("Desc","Programmer");*/


               /* model attribute solve with in a line for form data receive*/
    /*  User user=new User();
        user.setEmail(userEmail);
        user.setUserName(userName);
        user.setPassword(userPassword);
       */
        System.out.println(user);

     /*   System.out.println("userEmail"+userEmail);
        System.out.println("UserName"+userName);
        System.out.println("UserPassword"+userPassword);*/

        //process
        /*model.addAttribute("user",user);*/
       /* model.addAttribute("email",userEmail );
        model.addAttribute("name",userName );
        model.addAttribute("password",userPassword );
        */
        return "success";
    }
}

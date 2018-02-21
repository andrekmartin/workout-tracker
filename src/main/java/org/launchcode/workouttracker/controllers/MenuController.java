package org.launchcode.workouttracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MenuController {

    @RequestMapping(value="")
    @ResponseBody
    public String index(){
        return "Home Page";
    }

    @RequestMapping(value="signup")
    @ResponseBody
    public String signup(){
        return "Signup";
    }

    @RequestMapping(value="login")
    @ResponseBody
    public String login(){
        return "Login";

    }


}

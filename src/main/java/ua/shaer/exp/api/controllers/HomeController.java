package ua.shaer.exp.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "demo")
class HomeController {
    @GetMapping(value = "/hello")
    public String helloWorld(@RequestParam(name = "firstName",
            required = false,
            defaultValue = "World") String firstName, Model model) {

        model.addAttribute("firstName", firstName);
        return "home";   // home.html з templates
    }
}

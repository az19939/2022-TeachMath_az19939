package com.example.SchedulingApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    public  List<String> names = new ArrayList<>();

    @GetMapping("/Hello")
    public String helloWorld(@RequestParam(defaultValue = "world", required = false) String name, Model model) {
        model.addAttribute("TeachMath",name);
        return "Hello";
    }

    @GetMapping("/addName")
    @ResponseBody
    public  boolean addName(@RequestParam(required = false) String name) {
            if(name != null) {
                names.add(name);
                return true;
            }
            return false;
        }
}



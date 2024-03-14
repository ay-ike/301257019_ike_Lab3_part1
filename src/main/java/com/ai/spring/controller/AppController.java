package com.ai.spring.controller;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Amanda Ike (301257019)
 *
 **/
@Controller
public class AppController {
	@RequestMapping("/")
    public String home(Model model)
    {
		String custom_msg = "";
		String name = "Amanda Ike";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH.mm.ss");
		LocalTime localTime = LocalTime.now(); 
		
		if(localTime.isAfter(LocalTime.parse("12:00"))) {
			custom_msg = "Good afternoon";
		}else {
			custom_msg = "Good morning";
		}
		
		String display_msg = custom_msg + ", " + name + ". Welcome to COMP367";
		model.addAttribute("display_msg", display_msg);
		model.addAttribute("localTime", localTime.format(formatter));
        return "index";
    }
}

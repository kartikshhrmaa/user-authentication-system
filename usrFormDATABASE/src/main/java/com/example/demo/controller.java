package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {

	@Autowired
	private userRepo userRepository;
	
	@GetMapping("/form1")
	public String method1(Model model) {
		model.addAttribute("user", new corejava());
		return "index";
	}
	
	@PostMapping("/form2")
	public String method2(corejava user, Model model) {
		userRepository.save(user);
		model.addAttribute("message","User Registered Successfully!!");
		model.addAttribute("user", user);
		
		return "home";
	}
	
	@GetMapping("/login")
    public String showLogin(Model model) {
        model.addAttribute("user", new corejava());
        return "login";
    }
	
	@PostMapping("/loginUser")
    public String loginUser(@ModelAttribute corejava user, Model model) {
        corejava dbUser = userRepository.findByUsername(user.getUsername());

        if (dbUser != null && dbUser.getUserpassword().equals(user.getUserpassword())) {
            model.addAttribute("message", "Login Successful!");
            model.addAttribute("user", dbUser);
            return "home";
        } else {
            model.addAttribute("loginMessage", "Invalid username or password!");
            model.addAttribute("user", new corejava());
            return "login";
        }
    }
}

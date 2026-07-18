package com.spring_project.web_app.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@RestController
public class HelloController {
//    @Value("${welcome.message}")  
//    private String welcome;
//	
//	 @GetMapping("/hello")
//	 public String helloWorld() {
//             return welcome;
//	 }

	//  @GetMapping("/")
    // public String redirectToIndex() {
    //     // This will look for index.html in src/main/resources/static/
    //     return "redirect:/index.html";
    // }
	public void addViewControllers(ViewControllerRegistry registry) {
  			registry.addViewController("/").setViewName("forward:/index.html");
		}

}

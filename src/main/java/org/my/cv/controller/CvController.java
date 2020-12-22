package org.my.cv.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.my.cv.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CvController {

	@Value("${welcome.message}")
	private String message;
	private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
	
	@Autowired
	@Qualifier("resumeservice")
	ResumeService resumeservice;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getResume(ModelMap model) {
		//model.put("message", this.message);
		resumeservice.creategetmodel(model);
		return "welcome";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String postContacts(ModelMap model, @RequestParam String name, @RequestParam String email ,@RequestParam String subject
			,@RequestParam String message) {
		//model.put("message", this.message);
		resumeservice.creategetmodel(model);
		resumeservice.createpostmodel(model,name,email,subject,message);
		return "welcome";
	}
	
	
	
	
	/*@RequestMapping("/hello")
	    public String mainWithParam(
	            @RequestParam(name = "name", required = false, defaultValue = "")
				String name, Model model) {

	        model.addAttribute("message", name);

	        return "welcome"; //view
	        
	    } */

}

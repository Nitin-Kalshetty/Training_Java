package com.cf.spring.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AnnotationController {
//	@GetMapping//java.lang.IllegalStateException: Ambiguous mapping. Cannot map
//	public String displayPage() {
//		return "home";
//	}
//	@GetMapping
//	public String displayPage1() {
//		return "home";
//	}
	@GetMapping("/profile")
	public String profile() {
		return "success";
	}

	@PostMapping("/profile")
	public String profile(@RequestParam("username") String name,@RequestParam("mobile")int mobile,@RequestParam("city") String city) {
		System.out.println(name+" "+mobile+" "+city);
		return "success";
	}
	
	@GetMapping("/path/{iwanttogetpathvar}")//placeholder
	public String getPathVar(Model m,@PathVariable("iwanttogetpathvar") String pathValue) {
		//System.out.println(pathValue);
		m.addAttribute("numb", pathValue);
		return "success";
	}
	
	@GetMapping("/path1/{myid}")//placeholder
	public String getPathVar1(ModelMap m,@PathVariable String myid) {
		System.out.println("pathvar1 method "+myid);
		m.addAttribute("numb", myid);
		return "success";
	}
	
	@GetMapping("/course/{courseName}/{courseId}")//placeholder
	public ModelAndView getPathVar2(@PathVariable String courseName,Optional<Integer> courseId) {
		Integer cid= courseId.orElse(120);
		System.out.println("pathvar2 method "+courseName+" "+courseId);
		ModelAndView mv=new ModelAndView("success");
	//	mv.addObject("numb", courseName+" "+courseId);
		mv.addObject("numb", courseName+" "+cid);
		return mv;
	}
	
	  @GetMapping(params = "id=4")
	    public String handleUserId4() {
	        System.out.println("got param id = 4");
	        return "home";
	    }
}

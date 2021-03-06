package com.luv2code.springtest;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@RequestMapping("/")
	public String showForm(Model model)
	{
		Student theStudent = new Student();
		model.addAttribute("student", theStudent);
		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student theStudent , BindingResult theBindingResult)
	{
		if(theBindingResult.hasErrors())
		{
			return "student-form";
		}
		else
		{
		return "student-confirmation-form";
		}
	}
}

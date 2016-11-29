package kr.ac.course.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.course.model.Subject;
import kr.ac.course.model.Sum;
import kr.ac.course.service.SubjectService;

@Controller
public class CourseController {

	private SubjectService subjectsService;

	@Autowired
	public void setSubjectsService(SubjectService subjectsService) {
		this.subjectsService = subjectsService;
	}


	@RequestMapping("/creditInquiry1")
	public String showCreditInquiry1() {

		return "creditInquiry1";
	}

	@RequestMapping("/inquiry")
	public String showfreshman1(Model model, int year, int semester) {

		List<Subject> subjects = subjectsService.getCurrent(year, semester);
		model.addAttribute("subjects", subjects);

		return "inquiry";
	}


	@RequestMapping("/creditInquiry2")
	public String showCreditInquiry2(Model model) {

		List<Subject> subjects = subjectsService.getCurrent2();
		Sum sum = new Sum();

		int tmp = 0;
		for (int i = 0; i < subjects.size(); i++) {
			if (subjects.get(i).getType().equals("전선")) {
				
				tmp = sum.getSubj1();
				tmp += subjects.get(i).getCredit();
				sum.setSubj1(tmp);
				
			} else if (subjects.get(i).getType().equals("전기")) {
				
				tmp = sum.getSubj2();
				tmp += subjects.get(i).getCredit();
				sum.setSubj2(tmp);

			} else if (subjects.get(i).getType().equals("전지")) {
				
				tmp = sum.getSubj3();
				tmp += subjects.get(i).getCredit();
				sum.setSubj3(tmp);

			} else if (subjects.get(i).getType().equals("일교")) {
				
				tmp = sum.getSubj4();
				tmp += subjects.get(i).getCredit();
				sum.setSubj4(tmp);

			} else if (subjects.get(i).getType().equals("핵교")) {
				
				tmp = sum.getSubj5();
				tmp += subjects.get(i).getCredit();
				sum.setSubj5(tmp);

			} else if (subjects.get(i).getType().equals("교필")) {
				
				tmp = sum.getSubj6();
				tmp += subjects.get(i).getCredit();
				sum.setSubj6(tmp);
			}
			
			tmp = 0;
			tmp = sum.getSum();
			tmp += subjects.get(i).getCredit();
			sum.setSum(tmp);
		}
		model.addAttribute("sum", sum);

		return "creditInquiry2";
	}
	
	@RequestMapping("/enrollCourse")
	public String enrollCourse(Model model) {

		model.addAttribute(new Subject());
		return "enrollCourse";
	}
	
	@RequestMapping("/enrollCourse2")
	public String enrollCourse2(Model model, @Valid Subject subject, BindingResult result) {
		
		
		if(result.hasErrors()){
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error : errors){
				error.getDefaultMessage();
			}
			return "enrollCourse";
		}
		subject.setYear(2017);
		subject.setSemester(1);
		
		subjectsService.insert(subject);

		return "enrollCourse2";
	}
	
	@RequestMapping("/courseInquiry")
	public String courseInquiry(Model model) {

		List<Subject> subjects = subjectsService.getCurrent3();
		model.addAttribute("subjects", subjects);

		return "courseInquiry";
	}
}

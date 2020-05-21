package kosta.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import kosta.mvc.model.domain.Student;
import kosta.mvc.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/select")
	public List<Student> select(){
		
		return service.selectAll();
	}

	@PostMapping(value = "/check" ,produces = "text/html;charset=UTF-8")
	public String stNoCheck(String stNo) {
		return service.stNoCheck(stNo);
	}
	
	@PostMapping(value = "/insert")
	public int insert(Student student) {
		return service.insert(student);
	}
	
	@PostMapping("/delete")
	public int delete(String stNo) {
		return service.delete(stNo);
	}
}










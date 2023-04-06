package xyz.qlsvrestapi.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.qlsvrestapi.model.Teacher;
import xyz.qlsvrestapi.model.dto.TeacherDto;
import xyz.qlsvrestapi.service.TeacherService;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
	private final TeacherService teacherService;

	@Autowired
	public TeacherController(TeacherService teacherService) {
		super();
		this.teacherService = teacherService;
	}
	
	@PostMapping
	public ResponseEntity<TeacherDto> addTeacher(@RequestBody final TeacherDto teacherDto){
		//Teacher teacher = teacherService.addTeacher(Teacher.from(teacherDto));
		
		Teacher teacher = teacherService.addTeacher((Teacher) Teacher.from(teacherDto));
		return new ResponseEntity<TeacherDto>((TeacherDto) teacherDto.from(teacher), HttpStatus.OK);
		
	}
	
	@GetMapping(value ="{id}")
	public ResponseEntity<TeacherDto> getTeacher(@PathVariable final Integer id){
		Teacher teacher = teacherService.getTeacher(id);
		return new ResponseEntity<TeacherDto>(TeacherDto.from(teacher), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "{id}")
	public ResponseEntity<TeacherDto> deleteTeacher(@PathVariable final Integer id){
		Teacher teacher = teacherService.deleteTeacher(id);
		return new ResponseEntity<TeacherDto>(TeacherDto.from(teacher), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<TeacherDto>> getTeachers(){
		List<Teacher> teachers = teacherService.geTeachers();
		List<TeacherDto> teacherDtos = teachers.stream().map(TeacherDto::from).collect(Collectors.toList());
		 return new ResponseEntity<>(teacherDtos, HttpStatus.OK);
	}
	
	
}

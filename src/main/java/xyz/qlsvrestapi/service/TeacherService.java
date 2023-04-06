package xyz.qlsvrestapi.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.layout.TTLLLayout;
import xyz.qlsvrestapi.model.Teacher;
import xyz.qlsvrestapi.repository.TeacherRepository;

@Service
public class TeacherService {
	private final TeacherRepository teacherRepository;
	private final DepartmentService departmentService;
	
	@Autowired
	public TeacherService(TeacherRepository teacherRepository, DepartmentService departmentService) {
		super();
		this.teacherRepository = teacherRepository;
		this.departmentService = departmentService;
	}
	
	public Teacher addTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}
	
	public Teacher getTeacher(Integer id) {
		return teacherRepository.findById(id).orElseThrow();
	}
	
	public Teacher deleteTeacher(Integer id) {
		Teacher teacher = getTeacher(id);
		teacherRepository.delete(teacher);
		return teacher;
		
	}
	
	public List<Teacher> geTeachers(){
		return StreamSupport.stream(teacherRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}
	
	
}

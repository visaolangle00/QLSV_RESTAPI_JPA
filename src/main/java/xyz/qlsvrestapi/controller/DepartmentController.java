package xyz.qlsvrestapi.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.qlsvrestapi.model.Company;
import xyz.qlsvrestapi.model.Department;
import xyz.qlsvrestapi.model.dto.CompanyDto;
import xyz.qlsvrestapi.model.dto.DepartmentDto;
import xyz.qlsvrestapi.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	private final DepartmentService departmentService;

	public DepartmentController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}
	
	@PostMapping
	public ResponseEntity<DepartmentDto> addDepartment(@RequestBody final DepartmentDto departmentDto ){
		Department department = departmentService.addDepartment(Department.from(departmentDto));
		return new ResponseEntity<>(DepartmentDto.from(department), HttpStatus.OK);
	}
	
	@GetMapping(value = "{id}")
	 public ResponseEntity<DepartmentDto> getCompany(@PathVariable final Integer id){
		Department department = departmentService.getDepartment(id);
        return new ResponseEntity<>(DepartmentDto.from(department), HttpStatus.OK);
    }
	
	 @DeleteMapping(value = "{id}")
	    public ResponseEntity<DepartmentDto> deleteCompany(@PathVariable final Integer id){
	        Department department = departmentService.deleteDepartment(id);
	        return new ResponseEntity<>(DepartmentDto.from(department), HttpStatus.OK);
	    }
	
	 @PutMapping(value = "{id}")
	    public ResponseEntity<DepartmentDto> editDepartment(@PathVariable final Integer id,
	                                            @RequestBody final DepartmentDto departmentDto){
	        Department editDepartment = departmentService.editCompany(id, Department.from(departmentDto));
	        return new ResponseEntity<>(DepartmentDto.from(editDepartment), HttpStatus.OK);
	    }
	 
	 
	 @GetMapping
	    public ResponseEntity<List<DepartmentDto>> getCompanys(){
	        List<Department> department = departmentService.getDepartments();
	        List<DepartmentDto> departmentDtos = department.stream().map(DepartmentDto::from).collect(Collectors.toList());
	        return new ResponseEntity<>(departmentDtos, HttpStatus.OK);
	    }
	
}

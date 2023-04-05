package xyz.qlsvrestapi.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import jakarta.transaction.Transactional;
import xyz.qlsvrestapi.model.Company;
import xyz.qlsvrestapi.model.Department;
import xyz.qlsvrestapi.model.exception.DepartmentNotFoundException;
import xyz.qlsvrestapi.repository.DepartmentRepository;

public class DepartmentService {
	private final DepartmentRepository departmentRepository;

	public DepartmentService(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}
	
	public Department addDepartment(Department department) {
		return departmentRepository.save(department);
	}
	
	public Department getDepartment(Integer id) {
		return departmentRepository.findById(id).orElseThrow(()-> new  DepartmentNotFoundException(id));
	}
	
	public Department deleteDepartment(Integer id) {
		Department department = getDepartment(id);
		departmentRepository.deleteById(id);
		return department;
	}
	
	public List<Department> getDepartments(){
        return StreamSupport
                .stream(departmentRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
	
	 @Transactional
	    public Department editCompany(Integer id, Department department){
	       Department  departmentToEdit = getDepartment(id);
	       departmentToEdit.setName(department.getName());
	       departmentToEdit.setCode(department.getCode());
	       departmentToEdit.setParentId(department.getParentId());
	        return departmentToEdit;
	    }
	
	
	
	
	
}

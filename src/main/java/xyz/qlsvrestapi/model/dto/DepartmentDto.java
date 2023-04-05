package xyz.qlsvrestapi.model.dto;

import xyz.qlsvrestapi.model.Company;
import xyz.qlsvrestapi.model.Department;

public class DepartmentDto {
	private Integer id;
	private  String Name;
	private String Code;
	private Integer parentId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	
	public static DepartmentDto from(Department department) {
		DepartmentDto departmentDto = new DepartmentDto();
		departmentDto.setId(department.getId());
		departmentDto.setName(department.getName());
		departmentDto.setCode(department.getCode());
		departmentDto.setParentId(department.getParentId());
		
		return departmentDto;
	}
	
	
	
	
}

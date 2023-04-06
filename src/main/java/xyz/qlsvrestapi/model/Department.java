package xyz.qlsvrestapi.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import xyz.qlsvrestapi.model.dto.CompanyDto;
import xyz.qlsvrestapi.model.dto.DepartmentDto;

//@Entity
//public class Department   {
////	@Id
////	private Integer id;
////	private String Name;
////	private String Code;
////	private Integer parentId;
////	
////	@OneToMany(mappedBy = "id")
////	private Department department;
////	
////	@OneToOne(mappedBy = "department")
////	private Teacher teacher;
//	
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer id;
//	private  String Name;
//	private String Code;
//	private Integer parentId;
//	
//	@OneToOne(mappedBy = "department")
//	
//	private Teacher teacher;
//	
//	public Teacher getTeacher() {
//		return teacher;
//	}
//	public void setTeacher(Teacher teacher) {
//		this.teacher = teacher;
//	}
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public String getName() {
//		return Name;
//	}
//	public void setName(String name) {
//		Name = name;
//	}
//	public String getCode() {
//		return Code;
//	}
//	public void setCode(String code) {
//		Code = code;
//	}
//	public Integer getParentId() {
//		return parentId;
//	}
//	public void setParentId(Integer parentId) {
//		this.parentId = parentId;
//	}
//	
//	public static Department from(DepartmentDto departmentDto) {
//		Department department = new Department();
//		// quan trong cai de...
//		department.setName(departmentDto.getName());
//		department.setParentId(departmentDto.getParentId());
//		department.setCode(departmentDto.getCode());
//		
//		return department;
//	}
//	
//	
//	
//}


@Entity
public class Department   {
private static final String Department = null;
//	@Id
//	private Integer id;
//	private String Name;
//	private String Code;
//	private Integer parentId;
//	
//	@OneToMany(mappedBy = "id")
//	private Department department;
//	
//	@OneToOne(mappedBy = "department")
//	private Teacher teacher;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private  String Name;
	private String Code;
	private Integer parentId;
	
//	@ManyToOne
//	private Teacher teacher;
	
	@OneToMany
	private List<Teacher> teachers;
	
	
	
	
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
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
	
	public static Department from(DepartmentDto departmentDto) {
		Department department = new Department();
		// quan trong cai de...
		department.setName(departmentDto.getName());
		department.setParentId(departmentDto.getParentId());
		department.setCode(departmentDto.getCode());
		
		return department;
	}
	
	
	
}


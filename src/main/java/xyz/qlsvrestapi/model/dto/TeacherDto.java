package xyz.qlsvrestapi.model.dto;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import xyz.qlsvrestapi.model.Department;
import xyz.qlsvrestapi.model.Teacher;

public class TeacherDto extends PersonDto {
	
	  @PersistenceContext
	@Autowired
    private static EntityManager entityManager;

	public TeacherDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeacherDto(Integer id, String name, String code, String address, String gender, Date birthDate) {
		super(id, name, code, address, gender, birthDate);
		// TODO Auto-generated constructor stub
	}
	
	private Department department;

	public Department getDepartment() {
		return department;
	}
	
	//
	public Integer getDepartmentDtoId() {
        return this.department.getId();
    }
    
    public void setDepartmentDtoId(Integer id) {
        if (this.department == null) {
            this.department = new Department();
        }
        this.department.setId(id);
    }
    //
	

	public void setDepartment(Department department) {
		this.department = department;
	}

	public static TeacherDto from(Teacher teacher) {
		TeacherDto teacherdto = new TeacherDto();
		teacherdto.setId(teacher.getId());
		teacherdto.setName(teacher.getName());
		teacherdto.setCode(teacher.getCode());
		teacherdto.setAddress(teacher.getAddress());
		teacherdto.setGender(teacher.getGender());
		teacherdto.setBirthDate((Date) teacher.getBirthDate());
		//teacherdto.setDepartment(teacher.getDepartment());
		
		//teacherdto.setDepartment(teacher.getDepartment());
		
		//teacherdto.setDepartmentDtoId(teacher.getDepartmentId());
		//teacherdto.setDepartment(department);
		
//		 Department department = entityManager.getReference(Department.class, teacher.getDepartment());
//		teacherdto.setDepartment(department);
		
		
		 if (teacher.getDepartment()!= null) {
//			 Department department = entityManager.getReference(Department.class, teacher.getDepartment());
//	           teacherdto.setDepartment(department);
			 
			// teacherdto.setDepartment(teacher.getDepartment().getId());
			 teacherdto.setDepartment(teacher.getDepartment()); 
			 
	        }
		
		
		return teacherdto;
	}
}

package xyz.qlsvrestapi.model;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PersistenceContext;
import xyz.qlsvrestapi.model.dto.TeacherDto;

//@Entity
//public class Teacher  extends Person {
////	@Id
////	private Integer Id;
////	
////	private String Name;
////	private String Code;
////	private String address;
////	private String gender;
////	private Date birthDate;
////	
////	@OneToOne(mappedBy = "teacher")
////	private Project pr;
////	
////	@OneToOne
////	private Department department;
//	
////	@OneToOne
//	//private Department department;
//	
////	@OneToOne
////	(cascade = CascadeType.ALL)
////	@JoinColumn(name = "person_id")
//	
//	private Person person;
//	
//	public Person getPerson() {
//		return person;
//	}
//
//	public void setPerson(Person person) {
//		this.person = person;
//	}
//
//	public Department getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(Department department) {
//		this.department = department;
//	}
//
//	public Teacher() {
//		
//	}
//
//	public Teacher(String name, String code, String address, String gender, Date birthDate) {
//		super(name, code, address, gender, birthDate);
//	}
//	
//	
//	
//	
//}

@Entity
public class Teacher extends Person {
	
	  @PersistenceContext
	@Autowired
    private static  EntityManager entityManager;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, String code, String address, String gender, Date birthDate) {
		super(name, code, address, gender, birthDate);
		// TODO Auto-generated constructor stub
	}
	
//	@OneToMany
//	private List<Department> departments;
	
	@ManyToOne
	private Department department;
	
	
	@OneToMany
	
	private List<Project> project;
	

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	

	
	
	///
	
//	 public Integer getDepartmentId() {
//	        return this.department.getId();
//	    }
//	    
//	    public void setDepartmentId(Integer id) {
//	        if (this.department == null) {
//	            this.department = new Department();
//	        }
//	        this.department.setId(id);
//	    }
	
	//    

	public Teacher(String name, String code, String address, String gender, Date birthDate, Department department) {
		super(name, code, address, gender, birthDate);
		this.department = department;
	}
	
	
	
	
	
	
	
	
	
//	@Id
//	private Integer Id;
//	
//	private String Name;
//	private String Code;
//	private String address;
//	private String gender;
//	private Date birthDate;
//	
//	@OneToOne(mappedBy = "teacher")
//	private Project pr;
//	
//	@OneToOne
//	private Department department;
//	
//
//	
//	
//	
//	public static Teacher from(TeacherDto teacherDto) {
//		Teacher teacher = new Teacher();
//		teacher.setId(teacherDto.getId());
//		teacher.setName(teacherDto.getName());
//		teacher.setCode(teacherDto.getCode());
//		teacher.setAddress(teacherDto.getAddress());
//		teacher.setGender(teacherDto.getGender());
//		teacher.setBirthDate((Date) teacherDto.getBirthDate());
////		teacher.setDepartment(teacherDto.getDepartment().getId());
////		teacher.setId(teacherDto.getDepartment().getId());
//		
//		
////		teacher.setDepartment(teacherDto.getDepartment().getId());
//		
//		
////		teacher.setDepartmentId(teacherDto.getDepartmentDtoId());
//
//		
//		
//		
//		
//		return teacher;
//	}
	
	
	public static Teacher from(TeacherDto teacherDto) {
		Teacher teacher = new Teacher();
		teacher.setId(teacherDto.getId());
		teacher.setName(teacherDto.getName());
		teacher.setCode(teacherDto.getCode());
		teacher.setAddress(teacherDto.getAddress());
		teacher.setGender(teacherDto.getGender());
		teacher.setBirthDate((Date) teacherDto.getBirthDate());
//		teacher.setDepartment(teacherDto.getDepartment().getId());
//		teacher.setId(teacherDto.getDepartment().getId());
		
		
//		teacher.setDepartment(teacherDto.getDepartment().getId());
		
		
//		teacher.setDepartmentId(teacherDto.getDepartmentDtoId());
		
		// Department department = entityManager.getReference(Department.class, teacherDto.getDepartment());
		 
		 if (teacherDto.getDepartment()!= null) {
			 Department department = entityManager.getReference(Department.class, teacherDto.getDepartment());
	           teacher.setDepartment(department);
	        }
		 
		// teacher.setDepartment(department);
		
		//teacher.setDepartment(department);

		
		
		
		
		return teacher;
	}
	
	
	
}

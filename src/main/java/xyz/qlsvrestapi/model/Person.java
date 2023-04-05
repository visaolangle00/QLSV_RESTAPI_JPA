package xyz.qlsvrestapi.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public  class Person {
//	@Id
//	private Integer id;
//	private String Name;
//	private String Code;
//	private String address;
//	private String gender;
//	private Date birthDate;
//	
//	
//	
//	
//	
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return Name;
//	}
//
//	public void setName(String name) {
//		Name = name;
//	}
//
//	public String getCode() {
//		return Code;
//	}
//
//	public void setCode(String code) {
//		Code = code;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getGender() {
//		return gender;
//	}
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//
//	public Date getBirthDate() {
//		return birthDate;
//	}
//
//	public void setBirthDate(Date birthDate) {
//		this.birthDate = birthDate;
//	}
//
//	public Student getStu() {
//		return stu;
//	}
//
//	public void setStu(Student stu) {
//		this.stu = stu;
//	}
//
//	public Person() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	@OneToOne(mappedBy = "person")
//	private Student stu;
//
//	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Integer id;
	protected String Name;
	protected String Code;
	protected String address;
	protected String gender;
	protected Date birthDate;
	
	

	public Person(String name, String code, String address, String gender, Date birthDate) {
		super();
		Name = name;
		Code = code;
		this.address = address;
		this.gender = gender;
		this.birthDate = birthDate;
	}



	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
}

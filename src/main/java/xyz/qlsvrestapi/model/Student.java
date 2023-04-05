package xyz.qlsvrestapi.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student extends Person   {
//	@Id
//	private  Integer id;
//	private String Name;
//	private String Code;
//	
//	
//	private String address;
//	private String gender;
//	private String birthDate;
//	private Date year;
//	
//	
//
//	
//	
//	
//	public Student() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	
//	@OneToOne(mappedBy = "student")
//	private StudentProject stp;
//	
//	@OneToOne
//	private Person person;
//	
//
//	
//	
	
	
	
	private Date year;
	
	



	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Student( String name, String code, String address, String gender, Date birthDate, Date year) {
		super( name, code, address, gender, birthDate);
		// TODO Auto-generated constructor stub
		this.year = year; 
	}

	
	

	
	
	
	
	

	

	
	
	
	
	
	
	
	
	
} 

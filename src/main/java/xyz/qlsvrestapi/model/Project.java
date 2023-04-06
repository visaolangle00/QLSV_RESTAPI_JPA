package xyz.qlsvrestapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Project {
//	@Id
//	private Integer id;
//	
//	private  String Name;
//	
//	private String Code;
//	
//	@OneToOne(mappedBy = "project")
//	private StudentProject  stp;
//	
//	@OneToOne
//	private Teacher teacher;
//	
	
	@Id
	private Integer id;
	
	private String Name;
	
	private String Code;
	
	@ManyToOne
	private Teacher teacher;
	
}

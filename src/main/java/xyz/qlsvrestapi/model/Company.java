package xyz.qlsvrestapi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import xyz.qlsvrestapi.model.dto.CompanyDto;


@Entity
public class Company {
//	@Id
//	private Integer id;
//	
//	private String Name;
//	
//	private String Code;
//	
//	@OneToOne(mappedBy = "company")
//	private Intern intern;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String Name;
	
	private String Code;
	
	private String address;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public static Company from(CompanyDto companyDto) {
		Company company = new Company();
		// quan trong cai de...
		company.setName(companyDto.getName());
		company.setAddress(companyDto.getAddress());
		company.setCode(companyDto.getCode());
		
		return company;
	}
	
	
	
}

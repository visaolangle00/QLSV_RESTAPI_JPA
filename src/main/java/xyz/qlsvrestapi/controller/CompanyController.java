package xyz.qlsvrestapi.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.qlsvrestapi.model.Company;
import xyz.qlsvrestapi.model.dto.CompanyDto;
import xyz.qlsvrestapi.service.CompanyService;

@RestController
@RequestMapping("/companys")
public class CompanyController {
	private final CompanyService companyService;

	@Autowired
	public CompanyController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}
	
	@PostMapping
	public ResponseEntity<CompanyDto> addCompany(@RequestBody final CompanyDto companyDto ){
		Company company = companyService.addCompany(Company.from(companyDto));
		return new ResponseEntity<>(CompanyDto.from(company), HttpStatus.OK);
	}
	
	@GetMapping(value = "{id}")
	 public ResponseEntity<CompanyDto> getCompany(@PathVariable final Integer id){
        Company company = companyService.getCompany(id);
        return new ResponseEntity<>(CompanyDto.from(company), HttpStatus.OK);
    }
	
	 @DeleteMapping(value = "{id}")
	    public ResponseEntity<CompanyDto> deleteCompany(@PathVariable final Integer id){
	        Company company = companyService.deleteCompany(id);
	        return new ResponseEntity<>(CompanyDto.from(company), HttpStatus.OK);
	    }
	
	 @PutMapping(value = "{id}")
	    public ResponseEntity<CompanyDto> editCompany(@PathVariable final Integer id,
	                                            @RequestBody final CompanyDto companyDto){
	        Company editCompany = companyService.editCompany(id, Company.from(companyDto));
	        return new ResponseEntity<>(CompanyDto.from(editCompany), HttpStatus.OK);
	    }
	 
	 
	 @GetMapping
	    public ResponseEntity<List<CompanyDto>> getCompanys(){
	        List<Company> company = companyService.getCompanys();
	        List<CompanyDto> companyDtos = company.stream().map(CompanyDto::from).collect(Collectors.toList());
	        return new ResponseEntity<>(companyDtos, HttpStatus.OK);
	    }
	
}

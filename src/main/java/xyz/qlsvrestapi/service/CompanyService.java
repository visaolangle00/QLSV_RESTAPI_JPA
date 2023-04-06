package xyz.qlsvrestapi.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import xyz.qlsvrestapi.model.Company;
import xyz.qlsvrestapi.model.dto.CompanyDto;
import xyz.qlsvrestapi.model.exception.CompanyNotFoundException;
import xyz.qlsvrestapi.repository.CompanyRepository;

@Service
public class CompanyService {
	private final CompanyRepository companyRepository;

	@Autowired
	public CompanyService(CompanyRepository companyRepository) {
		super();
		this.companyRepository = companyRepository;
	}
	
	public Company addCompany( Company company){
        return companyRepository.save(company);
    }
	
	public Company getCompany(Integer id){
        return companyRepository.findById(id).orElseThrow(() ->
                new CompanyNotFoundException(id));
    }
	
	 public Company deleteCompany(Integer id){
	        Company company = getCompany(id);
	        companyRepository.delete(company);
	        return company;
	    }
	 
	 public List<Company> getCompanys(){
	        return StreamSupport
	                .stream(companyRepository.findAll().spliterator(), false)
	                .collect(Collectors.toList());
	    }


	
	 @Transactional
	    public Company editCompany(Integer id, Company company){
	       Company  companyToEdit = getCompany(id);
	       companyToEdit.setName(company.getName());
	       companyToEdit.setCode(company.getCode());
	       companyToEdit.setAddress(company.getAddress());
	        return companyToEdit;
	    }
	 
	 
	 
	 public Page<CompanyDto> getPages(int pageNumber, int pageSize) {
	        Pageable pageable = PageRequest.of(pageNumber, pageSize);
	        Page<Company> companyPage = companyRepository.findAll(pageable);
	        List<CompanyDto> companydtopagelist = companyPage.getContent().stream()
	                .map(CompanyDto::from)
	                .collect(Collectors.toList());
	       // return new PageImpl<>(companydtopagelist, pageable, companyPage.getTotalElements());
	        
	        return new PageImpl<>(companydtopagelist, pageable, companyPage.getTotalElements());
	    }
}

package xyz.qlsvrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import xyz.qlsvrestapi.model.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer> , JpaRepository<Company, Integer>{

}

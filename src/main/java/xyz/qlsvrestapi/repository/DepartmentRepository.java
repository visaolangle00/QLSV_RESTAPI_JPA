package xyz.qlsvrestapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import xyz.qlsvrestapi.model.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {

}

package xyz.qlsvrestapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import xyz.qlsvrestapi.model.Teacher;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Integer> {

}

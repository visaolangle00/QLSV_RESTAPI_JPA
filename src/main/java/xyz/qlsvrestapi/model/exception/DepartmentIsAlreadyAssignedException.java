package xyz.qlsvrestapi.model.exception;

import java.text.MessageFormat;

public class DepartmentIsAlreadyAssignedException extends RuntimeException {

	 public DepartmentIsAlreadyAssignedException(final 	Integer departmentId){
	        super(MessageFormat.format("Department: {0} is already assigned to department: {1}", departmentId));
	    }
	
}

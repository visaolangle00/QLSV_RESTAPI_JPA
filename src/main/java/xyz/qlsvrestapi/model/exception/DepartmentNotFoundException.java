package xyz.qlsvrestapi.model.exception;

import java.text.MessageFormat;

public class DepartmentNotFoundException extends RuntimeException {
	 public DepartmentNotFoundException(final Integer id){
	        super(MessageFormat.format("Could not find department with id: {0}", id));
	    }
}

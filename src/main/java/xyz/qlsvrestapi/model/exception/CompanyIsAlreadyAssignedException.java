package xyz.qlsvrestapi.model.exception;

import java.text.MessageFormat;

public class CompanyIsAlreadyAssignedException extends RuntimeException {

	 public CompanyIsAlreadyAssignedException(final Long companyId){
	        super(MessageFormat.format("Company: {0} is already assigned to Company: {1}", companyId));
	    }
	
}

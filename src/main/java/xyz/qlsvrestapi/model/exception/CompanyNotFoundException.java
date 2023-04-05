package xyz.qlsvrestapi.model.exception;

import java.text.MessageFormat;

public class CompanyNotFoundException extends RuntimeException {
	 public CompanyNotFoundException(final Integer id){
	        super(MessageFormat.format("Could not find company with id: {0}", id));
	    }
}

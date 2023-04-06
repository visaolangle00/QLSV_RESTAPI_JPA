package xyz.qlsvrestapi.model.exception;

import java.text.MessageFormat;

public class AlreadyAssignedException extends RuntimeException {
    public AlreadyAssignedException(final String message) {
        super(message);
    }
    
    
    public class CompanyIsAlreadyAssignedException extends AlreadyAssignedException {
        public CompanyIsAlreadyAssignedException(final Long companyId) {
            super(MessageFormat.format("Company: {0} is already assigned to Company", companyId));
        }
    }

    public class DepartmentIsAlreadyAssignedException extends AlreadyAssignedException {
        public DepartmentIsAlreadyAssignedException(final Integer departmentId) {
            super(MessageFormat.format("Department: {0} is already assigned to department", departmentId));
        }
    }
    
}

//public class AlreadyAssignedException extends Exception {
//    public AlreadyAssignedException(String message) {
//        super(message);
//    }
//}
//
//public class CompanyIsAlreadyAssignedException extends AlreadyAssignedException {
//    public CompanyIsAlreadyAssignedException(Long companyId) {
//        super("Company " + companyId + " is already assigned to another company");
//    }
//}
//
//public class DepartmentIsAlreadyAssignedException extends AlreadyAssignedException {
//    public DepartmentIsAlreadyAssignedException(Integer departmentId) {
//        super("Department " + departmentId + " is already assigned to another department");
//    }
//}





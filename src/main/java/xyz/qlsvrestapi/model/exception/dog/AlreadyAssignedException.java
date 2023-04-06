package xyz.qlsvrestapi.model.exception.dog;

public class AlreadyAssignedException extends Exception {
    public AlreadyAssignedException(String message) {
        super(message);
    }
}

//public abstract class AlreadyAssignedException extends Exception {
//    public AlreadyAssignedException(String message) {
//        super(message);
//    }
//    
//    public abstract String getEntityName();
//}
//
//public class CompanyIsAlreadyAssignedException extends AlreadyAssignedException {
//    private Long companyId;
//
//    public CompanyIsAlreadyAssignedException(Long companyId) {
//        super("Company " + companyId + " is already assigned to another company");
//        this.companyId = companyId;
//    }
//
//    @Override
//    public String getEntityName() {
//        return "Company " + companyId;
//    }
//}
//
//public class DepartmentIsAlreadyAssignedException extends AlreadyAssignedException {
//    private Integer departmentId;
//
//    public DepartmentIsAlreadyAssignedException(Integer departmentId) {
//        super("Department " + departmentId + " is already assigned to another department");
//        this.departmentId = departmentId;
//    }
//
//    @Override
//    public String getEntityName() {
//        return "Department " + departmentId;
//    }
//}
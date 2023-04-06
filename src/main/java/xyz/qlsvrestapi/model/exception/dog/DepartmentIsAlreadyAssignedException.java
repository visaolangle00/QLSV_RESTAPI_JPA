package xyz.qlsvrestapi.model.exception.dog;

public class DepartmentIsAlreadyAssignedException extends AlreadyAssignedException {
    public DepartmentIsAlreadyAssignedException(Integer departmentId) {
        super("Department " + departmentId + " is already assigned to another department");
    }
}

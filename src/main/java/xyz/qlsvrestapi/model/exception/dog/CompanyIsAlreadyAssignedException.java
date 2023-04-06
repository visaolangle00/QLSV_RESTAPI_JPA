package xyz.qlsvrestapi.model.exception.dog;

public class CompanyIsAlreadyAssignedException extends AlreadyAssignedException {
    public CompanyIsAlreadyAssignedException(Long companyId) {
        super("Company " + companyId + " is already assigned to another company");
    }
}

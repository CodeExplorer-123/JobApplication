package com.embarkx.firstjobapp.company;
import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    void createCompany(Company company);
    Company getCompanyById(long id);
    boolean deleteCompanyById(Long id);
    boolean updateCompany(Company company, Long id);
}

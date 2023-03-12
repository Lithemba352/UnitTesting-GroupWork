/**
 * Company.Java
 * This is the pojo class
 * @author :Lithemba Nkqayi 220558558
 */
package za.ac.cput.domain;

import java.util.Objects;

public class Company {
    private String companyName;
    private int companyRegisteredNumber;
    private String email;

    public Company(String companyName, int companyRegisteredNumber, String email) {
        this.companyName = companyName;
        this.companyRegisteredNumber = companyRegisteredNumber;
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCompanyRegisteredNumber() {
        return companyRegisteredNumber;
    }

    public void setCompanyRegisteredNumber(int companyRegisteredNumber) {
        this.companyRegisteredNumber = companyRegisteredNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", companyRegisteredNumber=" + companyRegisteredNumber +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return companyRegisteredNumber == company.companyRegisteredNumber && Objects.equals(companyName, company.companyName);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}


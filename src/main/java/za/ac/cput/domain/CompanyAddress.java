package za.ac.cput.domain;

import java.util.Objects;

public class CompanyAddress {

    private String buildingCode;
    private String streetNameAndNumber;
    private String city;
    private int code;

    public CompanyAddress(String buildingNumber, String streetNameAndNumber, String city, int code) {
        this.buildingCode = buildingNumber;
        this.streetNameAndNumber = streetNameAndNumber;
        this.city = city;
        this.code = code;
    }

    public String getBuildingCode() {
        return buildingCode;
    }

    public void setBuildingCode(String buildingCode) {
        this.buildingCode = buildingCode;
    }

    public String getStreetNameAndNumber() {
        return streetNameAndNumber;
    }

    public void setStreetNameAndNumber(String streetNameAndNumber) {
        this.streetNameAndNumber = streetNameAndNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "CompanyAddress{" +
                "buildingNumber='" + buildingCode + '\'' +
                ", streetNameAndNumber='" + streetNameAndNumber + '\'' +
                ", city='" + city + '\'' +
                ", code=" + code +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyAddress that = (CompanyAddress) o;
        return Objects.equals(buildingCode, that.buildingCode);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

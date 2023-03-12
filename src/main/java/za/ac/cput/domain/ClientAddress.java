package za.ac.cput.domain;

import java.util.Objects;

public class ClientAddress {
    private String streetName;
    private String CityName;

    public ClientAddress(String streetName, String cityName) {

        this.streetName = streetName;
        CityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientAddress clientAddress = (ClientAddress) o;
        return Objects.equals(streetName, clientAddress.streetName) && Objects.equals(CityName, clientAddress.CityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetName, CityName);
    }

    @Override
    public String toString() {
        return "ClientAddress{" +
                "streetName='" + streetName + '\'' +
                ", CityName='" + CityName + '\'' +
                '}';
    }
}

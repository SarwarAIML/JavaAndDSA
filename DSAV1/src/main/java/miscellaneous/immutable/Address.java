package miscellaneous.immutable;

public class Address {
    int postalCode;
    String state;

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    String country;

    @Override
    public String toString() {
        return "Address{" +
                "postalCode=" + postalCode +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

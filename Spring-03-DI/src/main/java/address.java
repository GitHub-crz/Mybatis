public class address {
    private String privince;
    private String city;

    public String getPrivince() {
        return privince;
    }

    public void setPrivince(String privince) {
        this.privince = privince;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "address{" +
                "privince='" + privince + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

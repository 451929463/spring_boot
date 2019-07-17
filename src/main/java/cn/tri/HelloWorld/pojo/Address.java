package cn.tri.HelloWorld.pojo;

public class Address {
    private String city ;
    private String county ;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", county='" + county + '\'' +
                '}';
    }
}
 
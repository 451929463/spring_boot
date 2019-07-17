package cn.tri.HelloWorld.pojo;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component //将此java类纳入spring容器
@ConfigurationProperties(prefix = "student")
@Validated
public class Student {
    @Email
    private String email ;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Value("value")
    private String name ;
    @Value("24")
    private int age ;
    private Boolean sex ;
    private Date birthday ;
    private String[] hobbys ;
    private List merits ;
    private Address address ;
    private Map<String,String> location;

    public Map<String, String> getLocation() {
        return location;
    }

    public void setLocation(Map<String, String> location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String[] getHobbys() {
        return hobbys;
    }

    public void setHobbys(String[] hobbys) {
        this.hobbys = hobbys;
    }

    public List getMerits() {
        return merits;
    }

    public void setMerits(List merits) {
        this.merits = merits;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", hobbys=" + Arrays.toString(hobbys) +
                ", merits=" + merits +
                ", address=" + address +
                ", location=" + location +
                '}';
    }
}
 
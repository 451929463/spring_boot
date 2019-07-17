package cn.tri.HelloWorld.service;

import cn.tri.HelloWorld.pojo.Student;
import org.springframework.stereotype.Service;

public class MyService {
    private Student student ;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "MyService{" +
                "student=" + student +
                '}';
    }
}
 
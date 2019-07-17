package cn.tri.HelloWorld.config;

import cn.tri.HelloWorld.pojo.Student;
import cn.tri.HelloWorld.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Autowired
    Student student ;
    @Bean
    public MyService myService(){
        MyService myService = new MyService();
        myService.setStudent(student);
        return myService ;
    }
}
 
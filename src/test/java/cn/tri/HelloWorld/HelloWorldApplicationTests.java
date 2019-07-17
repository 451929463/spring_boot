package cn.tri.HelloWorld;

import ch.qos.logback.core.net.SyslogOutputStream;
import cn.tri.HelloWorld.pojo.Student;
import cn.tri.HelloWorld.service.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldApplicationTests {
	@Autowired
	Student student ;

	@Autowired
	ApplicationContext context ;
	//@Test
	public void contextLoads() {
		System.out.println("stu"+student.toString());

	}
	@Test
	public void testContext(){
		MyService myService = (MyService) context.getBean("myService");
		System.out.println("=========>>>"+myService);
	}


}

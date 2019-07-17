package cn.tri.HelloWorld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class MyServlet {
    @ResponseBody
    @RequestMapping("helloworld")
    public String helloworld(){
        return " my spring boot ";
    }
}
 
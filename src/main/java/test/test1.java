package test;

import com.pojo.Student;
import com.service.StudentService;
import com.service.StudentServiceimpl;
import com.tool.ServiceFactory;

public class test1 {
    public static void main(String[] args) {
        //StudentService ss = new StudentServiceImpl();
        StudentService ss = (StudentService) ServiceFactory.getService(new StudentServiceimpl());

        //测试添加操作
        //Student s = new Student();
        //s.setId("t2");
        //s.setName("hhh");
        //s.setAge(213);
        //ss.save(s);

        //测试根据id查单条操作
        Student s2 = ss.getById("1");
        System.out.println(s2);


        }
}

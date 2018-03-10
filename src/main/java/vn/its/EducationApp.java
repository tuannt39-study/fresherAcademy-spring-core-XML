package vn.its;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vn.its.service.StudentService;

public class EducationApp {
    public static void main(String[] args) {
//        StudentService studentService = new StudentServiceImpl();
//        List<Student> studentList = studentService.getAllStudent();
//        System.out.println(studentList.size());
//        Student student = studentList.get(0);
//        System.out.println(student);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        StudentService service =  applicationContext.getBean("studentService", StudentService.class);
        System.out.println(service.getAllStudent().size());
    }
}

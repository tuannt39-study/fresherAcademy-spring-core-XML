package vn.its;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EducationApp {
    public static void main(String[] args) {
//        StudentService studentService = new StudentServiceImpl();
//        List<Student> studentList = studentService.getAllStudent();
//        System.out.println(studentList.size());
//        Student student = studentList.get(0);
//        System.out.println(student);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");

    }
}

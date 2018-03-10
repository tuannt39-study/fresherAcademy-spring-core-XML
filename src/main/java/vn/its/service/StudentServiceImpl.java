package vn.its.service;

import vn.its.model.Student;
import vn.its.repository.StudentRepository;
import vn.its.repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl() {
        super();
        System.out.println("Default Constructor Injection");
    }

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        System.out.println("Constructor Injection");
        this.studentRepository = studentRepository;
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        System.out.println("Setter Injection");
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent(){
        return studentRepository.getAllStudent();
    }
}

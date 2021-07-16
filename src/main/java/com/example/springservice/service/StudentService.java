package com.example.springservice.service;

import com.example.springservice.StudentRepository;
import com.example.springservice.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import java.util.Optional;

@Service@Component(value = "studentService")
@WebService
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @WebMethod
    public Student save(Student student){
        return studentRepository.save(student);
    }

    @WebMethod
    public Student findById(int id){
        Optional<Student> optStudent = studentRepository.findById(id);

        return optStudent.orElse(null);
    }
    @WebMethod
    public Student update(Student student){
        return studentRepository.save(student);
    }

    @WebMethod
    public List<Student> all(){
        return studentRepository.findAll();
    }

    @WebMethod
    public void delete(Student student){
        studentRepository.delete(student);
    }


}

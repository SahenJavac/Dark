package com.sahen.foodcourt.happyeats.servicer;

import com.sahen.foodcourt.happyeats.model.Student;
import com.sahen.foodcourt.happyeats.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {

        return studentRepository.save(student);
    }
}

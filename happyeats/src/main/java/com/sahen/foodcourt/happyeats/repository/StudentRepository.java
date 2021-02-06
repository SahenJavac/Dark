package com.sahen.foodcourt.happyeats.repository;

import com.sahen.foodcourt.happyeats.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface StudentRepository extends JpaRepository<Student,Integer>{
  Student save(Student student);


}

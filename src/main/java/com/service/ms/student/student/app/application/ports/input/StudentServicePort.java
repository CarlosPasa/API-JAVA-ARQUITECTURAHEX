package com.service.ms.student.student.app.application.ports.input;

import com.service.ms.student.student.app.domain.model.Student;

import java.util.List;

public interface StudentServicePort {
    Student findById(Long id);
    List<Student> findAll();
    Student save(Student student);
    Student update(Long id,Student student);
    void deleteById(Long id);
}

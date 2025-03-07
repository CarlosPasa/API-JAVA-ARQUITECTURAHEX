package com.service.ms.student.student.app.infrastucture.adapters.output.persistence;

import com.service.ms.student.student.app.application.ports.output.StudentPersistencePort;
import com.service.ms.student.student.app.domain.model.Student;
import com.service.ms.student.student.app.infrastucture.adapters.output.persistence.mapper.StudentPersistenceMapper;
import com.service.ms.student.student.app.infrastucture.adapters.output.persistence.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class StudentPersistenceAdapter implements StudentPersistencePort {

    private final StudentRepository repository;
    private final StudentPersistenceMapper mapper;
    @Override
    public Optional<Student> findById(Long id) {

        return repository.findById(id)
                .map(mapper::toStudent);
    }

    @Override
    public List<Student> findAll() {
        return mapper.toStudentList(repository.findAll());
    }

    @Override
    public Student save(Student student) {
        return mapper.toStudent(
                repository.save(
                        mapper.toStudentEntity(student)
                ));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}

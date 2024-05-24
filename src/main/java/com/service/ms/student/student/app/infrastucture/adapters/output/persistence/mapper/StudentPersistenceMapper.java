package com.service.ms.student.student.app.infrastucture.adapters.output.persistence.mapper;

import com.service.ms.student.student.app.domain.model.Student;
import com.service.ms.student.student.app.infrastucture.adapters.output.persistence.entity.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentPersistenceMapper {

//    @Mapping(target = "age", source = "age") No es necesario si tiene el mismo nombre
    StudentEntity toStudentEntity(Student student);

    Student toStudent(StudentEntity entity);

    List<Student> toStudentList(List<StudentEntity> entityList);
}

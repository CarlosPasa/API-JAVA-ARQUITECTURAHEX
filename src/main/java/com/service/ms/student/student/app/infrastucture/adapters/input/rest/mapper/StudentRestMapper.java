package com.service.ms.student.student.app.infrastucture.adapters.input.rest.mapper;

import com.service.ms.student.student.app.domain.model.Student;
import com.service.ms.student.student.app.infrastucture.adapters.input.rest.model.request.StudentCreateRequest;
import com.service.ms.student.student.app.infrastucture.adapters.input.rest.model.response.StudentResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE) // Con el ignore ignoras los campos que no son mapeados
public interface StudentRestMapper {

    //@Mapping(target = "id", ignore = true)
    Student toStudent(StudentCreateRequest request);

    StudentResponse toStudentResponse(Student student);

    List<StudentResponse> toStudentResponseList(List<Student> studentList);
}

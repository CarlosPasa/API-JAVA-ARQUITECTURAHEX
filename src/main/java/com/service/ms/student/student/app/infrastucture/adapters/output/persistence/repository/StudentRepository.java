package com.service.ms.student.student.app.infrastucture.adapters.output.persistence.repository;

import com.service.ms.student.student.app.infrastucture.adapters.output.persistence.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}

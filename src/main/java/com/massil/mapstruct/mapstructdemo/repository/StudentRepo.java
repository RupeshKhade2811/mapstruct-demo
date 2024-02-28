package com.massil.mapstruct.mapstructdemo.repository;

import com.massil.mapstruct.mapstructdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;
@Repository
@Transactional
public interface StudentRepo extends JpaRepository<Student, UUID> {


}

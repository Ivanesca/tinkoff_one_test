package com.example.tinkoff_one_test;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface StudentRepository extends CrudRepository<Student, UUID> {
    @Query("SELECT * FROM students")
    List<Student> getAll();
}

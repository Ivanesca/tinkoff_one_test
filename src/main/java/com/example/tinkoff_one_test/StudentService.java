package com.example.tinkoff_one_test;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Scheduled(fixedDelay = 3600000)
    public void checkStudents() {
        studentRepository.findAll();
    }

    public Student getById(UUID id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        return studentOptional.orElse(null);
    }

    public List<Student> getAll() {
        return (List<Student>) studentRepository.findAll();
    }

    public void add(Student student) {
        studentRepository.save(student);
    }

    public void delete(Student student) {
        studentRepository.delete(student);
    }

    public void deleteById(UUID id) {
        studentRepository.deleteById(id);
    }
}

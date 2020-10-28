package com.org.svu.repository;

import com.org.svu.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student,Integer> {
    public  void deleteByStudentId(Integer studentId);
}

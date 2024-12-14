package com.example.JPAProject01.service;

import com.example.JPAProject01.entity.Student;
import com.example.JPAProject01.repo.StudentRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

   public Student saveStudent(Student student) {
       return studentRepo.save(student);
   }

   public List<Student> getAllStudents() {
       List <Student> list  = studentRepo.findAll();
       return list;

   }

    public Student getStudentsById(Integer id) {
       Optional<Student> byid = studentRepo.findById(id);
        Student student= byid.get();
        return student;
    }

    public Student updateStudent(Integer id,Student student) {
       Optional<Student> studentbyid = studentRepo.findById(id);
       Student stud = null;
       if(studentbyid.isPresent()) {
           Student dbStudentObject = studentbyid.get();
           dbStudentObject.setAge(student.getAge());
           dbStudentObject.setName(student.getName());
           dbStudentObject.setEmail(student.getEmail());
           stud =studentRepo.save(dbStudentObject);

       }else{
           System.out.println("Data not present in database");
       }
       return stud;


    }
    public Student deleteStudent(Integer id) {
        // Fetch the student to be deleted
        Optional<Student> studentOptional = studentRepo.findById(id);

        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            studentRepo.deleteById(id); // Delete the student
            return student; // Return the deleted student
        } else {
            throw new EntityNotFoundException("Student with ID " + id + " not found");
        }
    }

}

package com.example.student_department.repository;


import com.example.student_department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository
        extends JpaRepository<Department, Long> {

    //Department findDepartmentById(Long departmentId);
}


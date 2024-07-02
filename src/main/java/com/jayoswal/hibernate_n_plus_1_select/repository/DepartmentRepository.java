package com.jayoswal.hibernate_n_plus_1_select.repository;

import com.jayoswal.hibernate_n_plus_1_select.entity.Department;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    @Query("SELECT d FROM Department d LEFT JOIN FETCH d.employeeList")
    List<Department> solution1();

    // employeeList is field in Department Entity
//    @EntityGraph(attributePaths = {"employeeList"})
//    List<Department> findAll();
}

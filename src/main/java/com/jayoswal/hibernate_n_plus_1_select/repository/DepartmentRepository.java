package com.jayoswal.hibernate_n_plus_1_select.repository;

import com.jayoswal.hibernate_n_plus_1_select.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}

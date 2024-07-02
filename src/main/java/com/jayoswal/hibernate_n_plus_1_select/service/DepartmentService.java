package com.jayoswal.hibernate_n_plus_1_select.service;

import com.jayoswal.hibernate_n_plus_1_select.entity.Department;
import com.jayoswal.hibernate_n_plus_1_select.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> readAllDepartments(){
        List<Department> departmentList = departmentRepository.findAll();
        // List<Department> departmentList = departmentRepository.solution1();

        return departmentList;
    }
}

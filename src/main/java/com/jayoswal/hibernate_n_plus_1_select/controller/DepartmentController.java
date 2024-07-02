package com.jayoswal.hibernate_n_plus_1_select.controller;

import com.jayoswal.hibernate_n_plus_1_select.entity.Department;
import com.jayoswal.hibernate_n_plus_1_select.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("allDept")
    public ResponseEntity<List<Department>> readAllDept() {

        List<Department> departmentList = departmentService.readAllDepartments();

        return ResponseEntity.ok(departmentList);
    }
}

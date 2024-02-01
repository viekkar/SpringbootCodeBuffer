package com.dailycodebuffer.springboottutorials.service;

import com.dailycodebuffer.springboottutorials.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId);

    String deletDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);
}

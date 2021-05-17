package com.sanath.departmentservice.department.service;

import com.sanath.departmentservice.department.entity.Department;

public interface DepartmentService {
    Department save(Department department);

    Department getDepartmentById(Long id);
}

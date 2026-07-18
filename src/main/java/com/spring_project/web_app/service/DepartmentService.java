/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.spring_project.web_app.service;

import com.spring_project.web_app.entity.Department;
import com.spring_project.web_app.error.DepartmentNotFoundException;
import java.util.List;

/**
 *
 * @author nanua
 */
public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId)throws DepartmentNotFoundException;

    public void deleteDepartment(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
    
}

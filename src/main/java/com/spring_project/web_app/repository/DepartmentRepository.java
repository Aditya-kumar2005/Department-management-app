/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.spring_project.web_app.repository;

import com.spring_project.web_app.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nanua
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{
    public Department findByDepartmentNameIgnoreCase(String departmentName);
}

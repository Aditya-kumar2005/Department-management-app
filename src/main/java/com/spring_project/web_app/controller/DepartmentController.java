/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring_project.web_app.controller;

import com.spring_project.web_app.entity.Department;
import com.spring_project.web_app.error.DepartmentNotFoundException;
import com.spring_project.web_app.service.DepartmentService;
import jakarta.validation.Valid;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nanua
 */
@RestController
public class DepartmentController {
    
    @Autowired
    private DepartmentService departmentService;
    
    private final Logger LOGGER=LoggerFactory.getLogger(DepartmentController.class);
    
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Save department from department controller. ");
        return departmentService.saveDepartment(department);
    }
    
    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        LOGGER.info("Searching department from department controller. ");
        return departmentService.fetchDepartmentList();
        
    }
    
    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id")Long departmentId) throws DepartmentNotFoundException{
        
        return departmentService.fetchDepartmentById(departmentId);
        
    }
    @DeleteMapping("/departments/{id}")
    public String deleteDepartment(@PathVariable("id")Long departmentId){
        departmentService.deleteDepartment(departmentId);
        return "deleted successfully";
    }
    
    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id")Long departmentId,@RequestBody Department department){        
        return departmentService.updateDepartment(departmentId,department);
    }
    
    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name")String departmentName){
        
        return departmentService.fetchDepartmentByName(departmentName);
        
    }
}

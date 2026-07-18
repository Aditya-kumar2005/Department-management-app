/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.spring_project.web_app.controller;

import com.spring_project.web_app.entity.Department;
import com.spring_project.web_app.service.DepartmentService;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 *
 * @author nanua
 */
@WebMvcTest(DepartmentController.class)
public class DepartmentControllerTest {
    
    @Autowired
    private MockMvc mockMvc;
    
    @MockitoBean
    private DepartmentService departmentService;
    
    private Department department;
    
    @BeforeEach
    public void setUp() {
        department=Department.builder()
                .departmentName("")
                .departmentCode("")
                .departmentAddress("")
                .departmentId(1L)
                .build();
    }

    /**
     * Test of saveDepartment method, of class DepartmentController.
     */
    @Test
    public void testSaveDepartment() throws Exception {
        Department inputDepartment=Department.builder()
                .departmentName("ce-4")
                .departmentCode("102")
                .departmentAddress("kanpur-nagar")
                .build();
        
        Mockito.when(departmentService
                .saveDepartment(inputDepartment))
                .thenReturn(department);
        mockMvc.perform(MockMvcRequestBuilders.post("/departments")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                            "    \"departmentName\":\"ce-4\",\n" +
                            "    \"departmentAddress\":\"kanpur-nagar\",\n" +
                            "    \"departmentCode\":\"102\"\n" +
                            "}")).andExpect(status().isOk());
    }

    /**
     * Test of fetchDepartmentList method, of class DepartmentController.
     */
    @Test
    @Disabled
    public void testFetchDepartmentList() {
        System.out.println("fetchDepartmentList");
        DepartmentController instance = new DepartmentController();
        List<Department> expResult = null;
        List<Department> result = instance.fetchDepartmentList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of fetchDepartmentById method, of class DepartmentController.
     */
    @Test
    public void testFetchDepartmentById() throws Exception {
        Mockito.when(departmentService
                .fetchDepartmentById(1L)).thenReturn(department);
        
        mockMvc.perform(MockMvcRequestBuilders.get("/departments/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.departmentName")
                .value(department.getDepartmentName()));
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of updateDepartment method, of class DepartmentController.
     */
    @Test
    @Disabled
    public void testUpdateDepartment() {
        System.out.println("updateDepartment");
        Long departmentId = null;
        Department department = null;
        DepartmentController instance = new DepartmentController();
        Department expResult = null;
        Department result = instance.updateDepartment(departmentId, department);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of fetchDepartmentByName method, of class DepartmentController.
     */
    @Test
    @Disabled
    public void testFetchDepartmentByName() {
        System.out.println("fetchDepartmentByName");
        String departmentName = "";
        DepartmentController instance = new DepartmentController();
        Department expResult = null;
        Department result = instance.fetchDepartmentByName(departmentName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    private Object post(String departments) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

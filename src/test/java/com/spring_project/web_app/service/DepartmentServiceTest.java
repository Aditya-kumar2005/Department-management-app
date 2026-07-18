/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.spring_project.web_app.service;

import com.spring_project.web_app.entity.Department;
import com.spring_project.web_app.repository.DepartmentRepository;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

/**
 *
 * @author nanua
 */
@SpringBootTest
public class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockitoBean
    private DepartmentRepository departmentRepository;
   
    @BeforeEach
    public void setUp() {
        long departmentId=1L;
        Department department =Department.builder()
        .departmentName("CS")
        .departmentAddress("Kanpur")
        .departmentCode("CE-1001")
        .departmentId(departmentId) //252
        .build();
        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("CS"))
        .thenReturn(department);
    }

    /**
    * Test of fetchDepartmentByName method, of class DepartmentService.
    */
   @Test
   public void testFetchDepartmentByName() {
       System.out.
               println("fetchDepartmentByName");
       String departmentName = "CS";
       Department result = departmentService.fetchDepartmentByName(departmentName);
        assertEquals(departmentName, result.getDepartmentName());
   }
   
//    @AfterEach
//    public void tearDown() {
//    }

   /**
    * Test of saveDepartment method, of class DepartmentService.
    */
//     @Test
//      @Disabled
//    public void testSaveDepartment() {
//        System.out.println("saveDepartment");
//        Department department = null;
//        DepartmentService instance = new DepartmentServiceImpl();
//        Department expResult = null;
//        Department result = instance.saveDepartment(department);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

   /**
    * Test of fetchDepartmentList method, of class DepartmentService.
    */
//    @Test
//    @Disabled
//    public void testFetchDepartmentList() {
//        System.out.println("fetchDepartmentList");
//        DepartmentService instance = new DepartmentServiceImpl();
//        List<Department> expResult = null;
//        List<Department> result = instance.fetchDepartmentList();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

   /**
    * Test of fetchDepartmentById method, of class DepartmentService.
    */
//    @Test
//    @Disabled
//    public void testFetchDepartmentById() throws Exception {
//        System.out.println("fetchDepartmentById");
//        Long departmentId = null;
//        DepartmentService instance = new DepartmentServiceImpl();
//        Department expResult = null;
//        Department result = instance.fetchDepartmentById(departmentId);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

   /**
    * Test of deleteDepartment method, of class DepartmentService.
    */
//    @Test
//    @Disabled
//    public void testDeleteDepartment() {
//        System.out.println("deleteDepartment");
//        Long departmentId = null;
//        DepartmentService instance = new DepartmentServiceImpl();
//        instance.deleteDepartment(departmentId);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

   /**
    * Test of updateDepartment method, of class DepartmentService.
    */

//    @Test
//    @Disabled
//    public void testUpdateDepartment() {
//        System.out.println("updateDepartment");
//        Long departmentId = null;
//        Department department = null;
//        DepartmentService instance = new DepartmentServiceImpl();
//        Department expResult = null;
//        Department result = instance.updateDepartment(departmentId, department);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

   
}

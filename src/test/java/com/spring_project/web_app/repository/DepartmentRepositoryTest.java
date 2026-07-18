/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.spring_project.web_app.repository;

import com.spring_project.web_app.entity.Department;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jpa.test.autoconfigure.TestEntityManager;

/**
 *
 * @author nanua
 */
@DataJpaTest
public class DepartmentRepositoryTest {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private TestEntityManager testEntityManager;
    
//    public DepartmentRepositoryTest() {
//    }
    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
    @BeforeEach
    public void setUp() {
        Department department=
                Department.builder()
                .departmentName("Technical")
                .departmentCode("Te-2")
                .departmentAddress("Kanpur Nagar")
                .build();
        testEntityManager.persist(department);
    }
    
//    @AfterEach
//    public void tearDown() {
//    }

    /**
     * Test of findByDepartmentNameIgnoreCase method, of class DepartmentRepository.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Department result = departmentRepository.findById(1L).get();
        assertEquals(result.getDepartmentName(), "Technical");
    }

//    public class DepartmentRepositoryImpl implements DepartmentRepository {
//
//        public Department findByDepartmentNameIgnoreCase(String departmentName) {
//            return null;
//        }
//    }
    
}

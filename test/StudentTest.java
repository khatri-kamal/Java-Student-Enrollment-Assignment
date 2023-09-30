/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author B00848614
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Student.
     */
//    @Test
//    public void testGetName() {
//        System.out.println("getName");
//        Student instance = new Student("Samuel Kain",
//                "20/02/2000","M","PT",1,1);
//        String expResult = "Samuel Kain";
//        String result = instance.getName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code 
//        //and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }

    /**
     * Test of getDob method, of class Student.
     */
    @Test
    public void testGetDob() {
        System.out.println("getDob");
        Student instance = new Student("Samuel Kain",
                "20/02/2000","M","PT",1,1);
        String expResult = "20/02/2000";
        String result = instance.getDob();
        assertEquals(expResult, result);
        // TODO review the generated test code 
        //and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of getGender method, of class Student.
//     */
//    @Test
//    public void testGetGender() {
//        System.out.println("getGender");
//        Student instance = new Student("Samuel Kain","20/02/2000","M","PT",1,1);
//        String expResult = "M";
//        String result = instance.getGender();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getSMode method, of class Student.
//     */
//    @Test
//    public void testGetSMode() {
//        System.out.println("getSMode");
//        Student instance = new Student("Samuel Kain","20/02/2000","M","pt",1,1);
//        String expResult = "pt";
//        String result = instance.getSMode();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getYear method, of class Student.
//     */
//    @Test
//    public void testGetYear() {
//        System.out.println("getYear");
//        Student instance = new Student("Samuel Kain","20/02/2000","M","PT",1,1);
//        int expResult = 1;
//        int result = instance.getYear();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getModules method, of class Student.
//     */
//    @Test
//    public void testGetModules() {
//        System.out.println("getModules");
//        Student instance = new Student("Samuel Kain","20/02/2000","M","PT",1,1);
//        int expResult = 1;
//        int result = instance.getModules();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setName method, of class Student.
//     */
//    @Test
//    public void testSetName() {
//        System.out.println("setName");
//        String name = "Samuel Kain";
//        Student instance = new Student("Samuel Kain","20/02/2000","M","PT",1,1);
//        instance.setName(name);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDob method, of class Student.
//     */
//    @Test
//    public void testSetDob() {
//        System.out.println("setDob");
//        String dob = "20/02/2000";
//        Student instance = new Student("Samuel Kain","20/02/2000","M","PT",1,1);
//        instance.setDob(dob);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setGender method, of class Student.
//     */
//    @Test
//    public void testSetGender() {
//        System.out.println("setGender");
//        String gender = "M";
//        Student instance = new Student("Samuel Kain","20/02/2000","M","PT",1,1);
//        instance.setGender(gender);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setSMode method, of class Student.
//     */
//    @Test
//    public void testSetSMode() {
//        System.out.println("setSMode");
//        String sMode = "pt";
//        Student instance = new Student("Samuel Kain","20/02/2000","M","PT",1,1);
//        instance.setSMode(sMode);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setYear method, of class Student.
//     */
//    @Test
//    public void testSetYear() {
//        System.out.println("setYear");
//        int year = 1;
//        Student instance = new Student("Samuel Kain","20/02/2000","M","PT",1,1);
//        instance.setYear(year);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setModules method, of class Student.
//     */
//    @Test
//    public void testSetModules() {
//        System.out.println("setModules");
//        int modules = 1;
//        Student instance = new Student("Samuel Kain","20/02/2000","M","PT",1,1);
//        instance.setModules(modules);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toString method, of class Student.
//     */
//
//    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopcomputer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Troanca
 */
public class ALUTest {
    
    public ALUTest() {
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
     * Test of getOperator method, of class ALU.
     */
    @Test
    public void testGetOperator() {
        System.out.println("getOperator");
        Alu instance = new Alu();
        Character expResult = null;
        Character result = instance.getOperator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperator method, of class ALU.
     */
    @Test
    public void testSetOperator() {
        System.out.println("setOperator");
        Character operator = null;
        Alu instance = new Alu();
        instance.setOperator(operator);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperandUnu method, of class ALU.
     */
    @Test
    public void testGetOperandUnu() {
        System.out.println("getOperandUnu");
        Alu instance = new Alu();
        Integer expResult = null;
        Integer result = instance.getOperandUnu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperandUnu method, of class ALU.
     */
    @Test
    public void testSetOperandUnu() {
        System.out.println("setOperandUnu");
        Integer operandUnu = null;
        Alu instance = new Alu();
        instance.setOperandUnu(operandUnu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperandDoi method, of class ALU.
     */
    @Test
    public void testGetOperandDoi() {
        System.out.println("getOperandDoi");
        Alu instance = new Alu();
        Integer expResult = null;
        Integer result = instance.getOperandDoi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperandDoi method, of class ALU.
     */
    @Test
    public void testSetOperandDoi() {
        System.out.println("setOperandDoi");
        Integer operandDoi = null;
        Alu instance = new Alu();
        instance.setOperandDoi(operandDoi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRezultat method, of class ALU.
     */
    @Test
    public void testGetRezultat() {
        System.out.println("getRezultat");
        Alu instance = new Alu();
        Integer expResult = null;
        Integer result = instance.getRezultat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRezultat method, of class ALU.
     */
    @Test
    public void testSetRezultat() {
        System.out.println("setRezultat");
        Integer rezultat = null;
        Alu instance = new Alu();
        instance.setRezultat(rezultat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculeaza method, of class ALU.
     */
    @Test
    public void testCalculeaza() {
        System.out.println("calculeaza");
        Alu instance = new Alu();
        instance.calculeaza();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

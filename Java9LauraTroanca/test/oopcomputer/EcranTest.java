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
public class EcranTest {
    
    public EcranTest() {
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
     * Test of getAfisaj method, of class Ecran.
     */
    @Test
    public void testGetAfisaj() {
        System.out.println("getAfisaj");
        Ecran instance = null;
        String expResult = "";
        String result = instance.getAfisaj();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAfisaj method, of class Ecran.
     */
    @Test
    public void testSetAfisaj() {
        System.out.println("setAfisaj");
        String afisaj = "";
        Ecran instance = null;
        instance.setAfisaj(afisaj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
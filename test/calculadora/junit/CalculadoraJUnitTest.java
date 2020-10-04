/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author javie
 */
public class CalculadoraJUnitTest {
    
    public CalculadoraJUnitTest() {
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
     * Test of suma method, of class CalculadoraJUnit.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        CalculadoraJUnit instance = new CalculadoraJUnit();
        instance.setNum1(5);
        instance.setNum2(-2);
        float result = instance.suma();
        assertEquals(3, result, 0.0);
    }

    /**
     * Test of resta method, of class CalculadoraJUnit.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        CalculadoraJUnit instance = new CalculadoraJUnit();
        instance.setNum1(5);
        instance.setNum2(-2);
        float result = instance.resta();
        assertEquals(7, result, 0.0);
    }

    /**
     * Test of producto method, of class CalculadoraJUnit.
     */
    @Test
    public void testProducto() {
        System.out.println("producto");
        CalculadoraJUnit instance = new CalculadoraJUnit();
        instance.setNum1(5);
        instance.setNum2(-2);
        float result = instance.producto();
        assertEquals(-10, result, 0.0);
    }

    /**
     * Test of cociente method, of class CalculadoraJUnit.
     */
    @Test
    public void testCociente() {
        System.out.println("cociente");
        CalculadoraJUnit instance = new CalculadoraJUnit();
        instance.setNum1(5);
        instance.setNum2(-2);
        float result = instance.cociente();
        assertEquals(-2.5, result, 0.0);
    }
    
}

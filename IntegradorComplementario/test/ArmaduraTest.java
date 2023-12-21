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
import Entities.Armadura;

/**
 *
 * @author jopas
 */
public class ArmaduraTest {
    
    public ArmaduraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    
    
    @After
    public void tearDown() {
    }

   private Armadura armadura;

    @Before
    public void setUp() {
        // Configura el estado inicial de la armadura antes de cada prueba
        armadura = new Armadura();
        armadura.setConsumoBotas(2); // Establece un consumo de botas
        armadura.setGenerador(10);     // Establece una cantidad inicial de batería
    }

    @Test
    public void testCaminarConSuficienteEnergia() {
        // Prueba caminar con suficiente energía
        armadura.caminar(3, 2);  // Tiempo: 3, Intensidad: 2
        // Después de caminar, la batería restante debe ser 10 - (2 * 3 * 2) = 2
        assertEquals(2, armadura.getGenerador());
    }

    @Test
    public void testCaminarSinSuficienteEnergia() {
        // Prueba caminar sin suficiente energía
        armadura.caminar(4, 3);  // Tiempo: 4, Intensidad: 3
        // La armadura no tiene suficiente energía, la batería no debe cambiar
        assertEquals(10, armadura.getGenerador());
    }
}




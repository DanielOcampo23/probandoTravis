package test;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

import control.Ejecutable;

public class TestCases {

	@Test
	public void testSuma(){
		double ram = Math.random() * 100;
		
		int ramInt = (int) ram; 
		
		double ram1 = Math.random() * 100;
		
		int ramInt2 = (int) ram1; 
		
		int resultado = ramInt + ramInt2;
		
		int resultadoCalculadora = Ejecutable.sumar(ramInt, ramInt2);
		
		assertEquals(resultado, resultadoCalculadora);
	}
}

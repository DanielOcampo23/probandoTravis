package control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejecutable {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			System.out.println("Calculadora");
			System.out.println("Valor A:");
			String linea = in.readLine();
			int A = Integer.parseInt(linea);
			
			System.out.println("Valor B:");
			linea = in.readLine();
			int B= Integer.parseInt(linea);
			System.out.println("A+B= "+ sumar(A,B));
			
			System.out.println("HOLA MUNDOOOOOOOOOOo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static int sumar (int a,int b) {		
		int resultado = a + b;
		return resultado;
	}

}

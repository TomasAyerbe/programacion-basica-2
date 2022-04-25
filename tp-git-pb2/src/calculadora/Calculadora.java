package calculadora;

import java.util.Scanner;

public class Calculadora {
	
	public static Integer sumar(Integer n1, Integer n2) {
		Integer suma;
		
		suma = n1 + n2;
		
		return (suma);
	}
	
	public static Integer restar(Integer n1, Integer n2) {
		Integer resta;
		
		resta = n1 - n2;
		
		return (resta);
	}
	
	public static Integer multiplicar(Integer n1, Integer n2) {
		Integer multi;
		
		multi = n1 * n2;
		
		return (multi);
	}
	
	public static Integer dividir(Integer n1, Integer n2) {
		Integer division;
		
		division = n1 / n2;
		
		return (division);
	}
	
	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado = null;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese su operación \n 1 para multiplicar \n 2 para dividir \n 3 para sumar \n 4 para restar");
			System.out.print("Opción: ");
			opcion = teclado.nextInt();
		} while(opcion < 1 || opcion > 4);
		
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();
		
		teclado.close();
	
		switch (opcion) {
			case 1: resultado = multiplicar(a, b);
			break;
			case 2: resultado = dividir(a, b);
			break;
			case 3: resultado = sumar(a, b);
			break;
			case 4: resultado = restar(a, b);
			break;
		}
		
		System.out.println("El resultado es " + resultado.toString());
	}
		
}
package es.ifp.programacion.uf1.practica.ejercicio1;

/**
 *Calculadora tipo textual que introducidos dos valores puede realizar las operaciones de suma, resta, división, multiplicación o resto dependiendo de la opción elegida
 *
 *
 *@autor Edward Esteve Alban Imbaquingo
 */

import java.util.Scanner;

public class ProgramaPrincipal {
	
	
	public static void main(String[] args) {
		
		//Bloque de declaración de variables e inicializado

		String opciones;
		float num1=0.0f;
		float num2=0.0f;
		float resultado=0.0f;
		
		//Bloque de entrada de datos
		
		do {
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("============ CALCULADORA :: GESTIÓN DE AGUAS, SL ============");
			System.out.println("Introduzca una opción del menú:");
			System.out.println("1.  Sumar (+)");
			System.out.println("2.  Restar (-)");
			System.out.println("3.  Multiplicar (*)");
			System.out.println("4.  Dividir (/)");
			System.out.println("5.  Resto (%)");
			System.out.println("0.  Salir (S o s)");
			System.out.println("Introduzca una opción:");
			
			opciones = sc.nextLine();
			
			switch (opciones) {
			case "1", "+":
				System.out.println("Introduzca el primer número");
				num1 = Float.parseFloat(sc.nextLine());
				System.out.println("Introduzca el segundo número");
				num2 = Float.parseFloat(sc.nextLine());
				
				//Bloque de transformación de datos
				
				resultado = (float) (num1 + num2);
				
				//Bloque de salida de datos
				
				System.out.println("La suma de "+num1+" y "+num2+" es:"+resultado);
				break;
				
				//Bloque de entrada de datos
				
			case "2", "-":
				System.out.println("Introduzca el primer número");
				num1 = Float.parseFloat(sc.nextLine());
				System.out.println("Introduzca el segundo número");
				num2 = Float.parseFloat(sc.nextLine());
				
				//Bloque de transformación de datos
				
				resultado = (float) (num1 - num2);
				
				//Bloque de salida de datos
				
				System.out.println("La resta de "+num1+" y "+num2+" es:"+resultado);
				break;
				
				//Bloque de entrada de datos
				
			case "3", "*":
				System.out.println("Introduzca el primer número:");
				num1 = Float.parseFloat(sc.nextLine());
				System.out.println("Introduzca el segundo número");
				num2 = Float.parseFloat(sc.nextLine());
				
				//Bloque de transformación de datos
				
				resultado = (float) (num1 * num2);
				
				//Bloque de salida de datos
				
				System.out.println("La multiplicación de "+num1+" y "+num2+" es:"+resultado);
				break;
				
				//Bloque de entrada de datos
				
			case "4", "/":
				
				try {
					System.out.println("Introduzca el primer número:");
					num1 = Float.parseFloat(sc.nextLine());
					System.out.println("Introduzca el segundo número:");
					num2 = Float.parseFloat(sc.nextLine());
					
					//Bloque de transformación de datos
					
					resultado = (float) (num1 / num2);
					
					//Bloque de salida de datos
					
					System.out.println("La división de "+num1+" y "+num2+" es:"+resultado);
					
				}	catch (Exception e) {
					
					System.out.println("Error al dividir por 0");
				}
				break;
				
				//Bloque de entrada de datos
				
			case "5", "%":
				System.out.println("Introduzca el primer número:");
				num1 = Float.parseFloat(sc.nextLine());
				System.out.println("Introduzca el segundo número:");
				num2 = Float.parseFloat(sc.nextLine());
				
				//Bloque de transformación de datos
				
				resultado = (float) (num1 % num2);
				
				//Bloque de salida de datos
				
				System.out.println("El resto de "+num1+" y "+num2+" es:"+resultado);
				break;
			case "0", "S", "s":
				System.out.println("El programa ha finalizado");
			break;
			
			default: System.err.println("Opción incorrecta"); break;
			
			}
			
			
			
		} while (!opciones.equalsIgnoreCase("s")&&!opciones.equals("0"));
		
			
		
	}

}

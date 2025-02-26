package org.cuatrovientos.ed.calculadora;
import java.util.Scanner;
public class Main {


	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opciones;
		do {
		//Mostrar el menú de opciones
		            System.out.println();
		            System.out.println("\tMenú");
		            System.out.println("==========================");
		            System.out.println("\t1. Suma");
		            System.out.println("\t2. Resta");
		            System.out.println("\t3. Multiplicación");
		            System.out.println("\t4. División");
		            System.out.println("\t5. Ayuda");
		            System.out.println("\t6. Salir");
		            System.out.print("Introduce una opción: ");

		            opciones = Integer.parseInt(leer.nextLine());
		            
		            if (opciones < 1 || opciones > 6) {
		                System.out.println("Solo puedes elegir entre 1 y 6. Si necesitas ayuda pulsa 5");
		            }


		         // Ejecutar la operación seleccionada
		            switch (opciones) {
		                case 1 -> //todo hacer métodos;
		                case 2 -> //todo hacer métodos;
		                case 3 -> //todo hacer métodos;
		                case 4 -> //todo hacer métodos;
		                case 5 -> //todo hacer comentario de ayuda
		                case 6 -> System.out.println("Saliendo...");
		            }
		        } while (opciones != 6);
		        leer.close();
		    }
	
	// Método para realizar la suma
	private static void realizarSuma(Scanner leer) {
        System.out.println();
        System.out.println("\tSUMA\n");
        System.out.print("Ingresa el primer número: ");
        int num1 = Integer.parseInt(leer.nextLine());
        System.out.print("Ingresa el segundo número: ");
        int num2 = Integer.parseInt(leer.nextLine());

        System.out.println("\nEl resultado de la SUMA es: " + (num1 + num2));
    }
	// Método para realizar la resta
	private static void realizarResta(Scanner leer) {
	    System.out.println();
	    System.out.println("\tRESTA\n");
	    System.out.print("Ingresa el primer número: ");
	    int num1 = Integer.parseInt(leer.nextLine());
	    System.out.print("Ingresa el segundo número: ");
	    int num2 = Integer.parseInt(leer.nextLine());

	    System.out.println("Primer número (num1): " + num1);
	    System.out.println("Segundo número (num2): " + num2);

	    int resultado = num1 - num2;
	    System.out.println("\nEl resultado de la RESTA es: " + resultado);
	}

	// Método para realizar la multiplicación
	private static void realizarMultiplicacion(Scanner leer) {
	    System.out.println();
	    System.out.println("\tMULTIPLICACIÓN\n");
	    System.out.print("Ingresa el primer número: ");
	    int num1 = Integer.parseInt(leer.nextLine());
	    System.out.print("Ingresa el segundo número: ");
	    int num2 = Integer.parseInt(leer.nextLine());

	    System.out.println("\nEl resultado de la MULTIPLICACIÓN es: " + (num1 * num2));
	}
	// Método para realizar la división
	private static void realizarDivision(Scanner leer) {
	    System.out.println();
	    System.out.println("\tDIVISIÓN\n");
	    System.out.print("Ingresa el primer número: ");
	    double num1 = Double.parseDouble(leer.nextLine());
	    double num2;
	    do {
	        System.out.print("Ingresa el segundo número: ");
	        num2 = Double.parseDouble(leer.nextLine());
	    } while (num2 == 0);

	    System.out.println("\nEl resultado de la DIVISIÓN es: " + (num1 / num2));
	}


}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author arias
 */
public class JavaRecursividad {

        public static void main(String[] args) {
        
             Scanner entrada = new Scanner(System.in);

            System.out.println("Ejemplos de recursividad");

            Recursividades oRecursividades = new Recursividades();


            // EJERCICIO 1
            System.out.println("\n\nEjercicio 1 - Vocales");

            System.out.print("Ingresa una cadena: ");
            String cadena = entrada.nextLine();

            int resultadoVocales = oRecursividades.Vocales(cadena);

            System.out.println("Numero de vocales: " + resultadoVocales);


            // EJERCICIO 2
            System.out.println("\n\nEjercicio 2 - Suma de digitos");

            System.out.print("Cuantos numeros vas a ingresar: ");
            int cantidad = entrada.nextInt();

            int mayorSuma = -1;
            int numeroMayor = 0;

            for (int i = 1; i <= cantidad; i++) {

                System.out.print("Ingresa el numero " + i + ": ");
                int num = entrada.nextInt();

                int suma = oRecursividades.SumaDigitos(num);

                System.out.println("Suma de sus digitos: " + suma);

                if (suma > mayorSuma) {
                    mayorSuma = suma;
                    numeroMayor = num;
                }
            }

            System.out.println("\nEl numero cuya suma de digitos es mayor es: "
                    + numeroMayor);

            System.out.println("Su suma de digitos es: "
                    + mayorSuma);


            // EJERCICIO 3
            System.out.println("\n\nEjercicio 3 - Suma de los primeros n numeros");

            System.out.print("Ingresa el valor de n: ");
            int n = entrada.nextInt();

            int resultadoSuma = oRecursividades.SumaN(n);

            System.out.println("La suma de los primeros "
                    + n + " numeros es: " + resultadoSuma);


            entrada.close();
        


        }    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author arias
 */
public class Recursividades {
        // EJERCICIO 1
    public int Vocales(String cadena) {

        // Caso base
        if (cadena.length() == 0) {
            return 0;
        }

        char letra = Character.toLowerCase(cadena.charAt(0));

        int contador = 0;

        if (letra == 'a' || letra == 'e' ||
            letra == 'i' || letra == 'o' ||
            letra == 'u') {

            contador = 1;
        }

        // Caso general
        return contador + Vocales(cadena.substring(1));
    }


    // EJERCICIO 2
    public int SumaDigitos(int num) {

        // Caso base
        if (num < 10) {
            return num;
        }

        // Caso general
        return (num % 10) + SumaDigitos(num / 10);
    }


    // EJERCICIO 3
    public int SumaN(int n) {

        // Caso base
        if (n == 1) {
            return 1;
        }

        // Caso general
        return n = n + SumaN ( n - 1 );
    }
}

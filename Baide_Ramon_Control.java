/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baide_ramon_control;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author eliza
 */
public class Baide_Ramon_Control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("*****Menu de Opciones*****");
        System.out.println("1. Cadena");
        System.out.println("2. Notas");
        System.out.println("3. Clases");
        
        System.out.println("Seleccione una opcion");
        int opcion = entrada.nextInt();
        
        switch (opcion){
            case 1:
                Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        Map<Character, Integer> frecuencia = new HashMap<>();

        int i = 0;
        while (i < cadena.length()) {
            char caracter = cadena.charAt(i);
            frecuencia.put(caracter, frecuencia.getOrDefault(caracter, 0) + 1);
            i++;
        }

        
        char caracterMasRepetido = ' ';
        int maxFrecuencia = 0;

        for (Map.Entry<Character, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                caracterMasRepetido = entry.getKey();
                maxFrecuencia = entry.getValue();
            }
        }

        System.out.println("El caracter que mas se repite es: " + caracterMasRepetido + " con " + maxFrecuencia + " veces.");
            case 2:
                Scanner entrada_2 = new Scanner(System.in);
        int cantidadNotas = 0;

       
        do {
            System.out.print("Ingresa la cantidad de notas: ");
            cantidadNotas = entrada_2.nextInt();
            if (cantidadNotas <= 0) {
                System.out.println("Por favor, ingresa un número positivo.");
            }
        } while (cantidadNotas <= 0);

        double[] notas = new double[cantidadNotas];
        double suma = 0;
        double notaMayor = Double.MIN_VALUE;
        double notaMenor = Double.MAX_VALUE;

        
        for (int u = 0; u < cantidadNotas; u++) {
            double nota;
            do {
                System.out.print("Nota #" + (u + 1) + ": ");
                nota = entrada_2.nextDouble();
                if (nota < 0 || nota > 100) {
                    System.out.println("La nota debe estar entre 0 y 100. Inténtalo de nuevo.");
                }
            } while (nota < 0 || nota > 100);

            
            notas[u] = nota;
            suma += nota;

            
            if (nota > notaMayor) {
                notaMayor = nota;
            }
            if (nota < notaMenor) {
                notaMenor = nota;
            }
        }

        
        double promedio = suma / cantidadNotas;

        
        System.out.printf("Promedio: %.2f%%\n", promedio);
        System.out.printf("Nota mayor: %.2f\n", notaMayor);
        System.out.printf("Nota menor: %.2f\n", notaMenor);
        }
    }
    
}

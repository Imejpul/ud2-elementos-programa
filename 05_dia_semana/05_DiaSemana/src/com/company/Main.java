package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Muestra el día de la semana correspondiente a un número introducido por teclado

        //Inicializamos una variable global

        int valor = 0;

        //Aseguramos que el valor introducido es correcto

        do {
            System.out.println("Introducir valor");
            Scanner sc = new Scanner(System.in);
            valor = sc.nextInt();
        } while ((valor < 1) || (valor > 7));

        //comprobamos la correspondencia del valor introducido con el día de la semana

        switch (valor) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }
}

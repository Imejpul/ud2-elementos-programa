package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Calcular el área de un triángulo según valores introducidos por teclado

        //pedimos la base del triángulo

        System.out.println("Introducir base triángulo");
        Scanner b = new Scanner(System.in);
        int base = b.nextInt();

        //pedimos la base del triángulo

        System.out.println("Introducir altura triángulo");
        int altura = b.nextInt();

        //calculamos área y mostramos

        double area = (double) (base * altura) / 2;
        System.out.println("El área es: " + area);
    }
}

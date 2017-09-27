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
            Scanner h = new Scanner(System.in);
            int altura = h.nextInt();

        //calculamos área y mostramos

        int area = (base*altura)/2;
        System.out.println("El área es: " + area);
    }
}

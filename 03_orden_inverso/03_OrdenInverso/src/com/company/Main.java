package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Muestra en orden inverso al introducido tres números leidos por teclado

        //Pedimos valores

        System.out.println("Introducir valor 1");
            Scanner v1 = new Scanner(System.in);
            int valor1 = v1.nextInt();

        System.out.println("Introducir valor 2");
            Scanner v2 = new Scanner(System.in);
            int valor2 = v2.nextInt();

        System.out.println("Introducir valor 3");
            Scanner v3 = new Scanner(System.in);
            int valor3 = v3.nextInt();

        //Mostramos los valores en orden inverso
        System.out.println(valor3 + " , " + valor2 + " , " + valor1);
    }
}

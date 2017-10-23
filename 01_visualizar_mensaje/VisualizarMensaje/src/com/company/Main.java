package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Muestra un mensaje introducido por teclado

        System.out.println("Introduce mensaje a mostrar");

        //almacenamos el mensaje introducido por teclado

        Scanner sc = new Scanner(System.in);
        String mensaje = sc.nextLine();

        //mostramos el mensaje previamente introducido

        System.out.println(mensaje);
    }
}

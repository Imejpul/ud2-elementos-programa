package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Multiplicar dos valores introducidos por teclado

        //pedimos los valores

        System.out.println("Introducir primer valor");

            Scanner sc1 = new Scanner(System.in);
            int valorUno = sc1.nextInt();

        System.out.println("Introducir segundo valor");

            Scanner sc2 = new Scanner(System.in);
            int valorDos = sc2.nextInt();

        //Hacemos la operación almacenando el resultado en una variable

        int res = valorUno*valorDos;

        //Mostramos el resultado

        System.out.println(valorUno +  " x " + valorDos + " = " + res);
    }
}

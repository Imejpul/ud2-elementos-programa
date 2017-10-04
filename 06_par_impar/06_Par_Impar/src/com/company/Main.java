package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Introduzca un valor entero");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        int aux = valor%2;

        if (aux == 0){
            System.out.println("El valor introducido es Par");

            }else{
            System.out.println("El valor introducido es Impar");
        }
    }
}

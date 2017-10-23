package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        int valor = 0;
        int cantVal = 0;
        int res = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduzca cantidad de valores");

        cantVal = Integer.parseInt(br.readLine());

        for (int cont = 1; cont <= cantVal; cont++) {

            System.out.println("Introducir valor " + cont);

            valor = Integer.parseInt(br.readLine());

            res = res + valor;

        }

        System.out.println("El resultado es: " + res);
    }
}

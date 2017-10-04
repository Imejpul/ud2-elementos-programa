package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        int valor = 1;
        int cont = 1;
        int res = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {

            System.out.println("Introducir valor " + cont);

            String aux = br.readLine();

            valor = Integer.parseInt(aux);

            res = res + valor;
            cont++;

        } while (cont <= 10);

        System.out.println("El resultado es: " + res);

    }
}

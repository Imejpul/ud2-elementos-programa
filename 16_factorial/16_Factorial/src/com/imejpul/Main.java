package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = 1;

        System.out.println("Introducir valor a calcular");
        String aux = br.readLine();
        int valor = Integer.parseInt(aux);

        int fact = 1;

        System.out.print(valor + "!: ");

        while (valor > 0){

            System.out.print(fact + " * ");
            res = res * fact;
            fact++;
            valor--;
        }

        System.out.println(", El resultado es: " + res);


    }
}

package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = 1;

        System.out.println("Introducir valor a calcular");
        int valor = Integer.parseInt(br.readLine());

        System.out.print(valor + "!: ");

        for (int fact = 1, aux = valor; valor > 0; valor--, fact++) {

            System.out.print(fact + "");
            if (fact != aux) {

                System.out.print(" * ");

            } else {

                System.out.print(", ");

            }

            res = res * fact;

        }

        System.out.println("el resultado es: " + res);

    }
}

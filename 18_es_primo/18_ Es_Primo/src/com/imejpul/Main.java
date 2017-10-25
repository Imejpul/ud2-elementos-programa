package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introducir nº");

        int numero = Integer.parseInt(br.readLine());
        boolean primo = false;
        int contador = 2;

        do {
            if (numero % contador == 0) {

                primo = true;

            } else {

                contador++;
            }

        } while (contador < numero && !primo);

        if (primo = true) {

            System.out.println("El número " + numero + " NO es primo");

        } else {

            System.out.println("El número " + numero + " ES primo");
        }

    }
}

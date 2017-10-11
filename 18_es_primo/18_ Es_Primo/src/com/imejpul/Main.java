package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introducir nº");

        String aux = br.readLine();

        int numero = Integer.parseInt(aux);

        int divisores = 0;
        int contador = 1;

        do{
            if (numero % contador == 0){

                divisores++;
                contador++;

            } else {

                contador++;
            }

        } while (contador < (numero +1));

        if (divisores != 2){

            System.out.println("El número " + numero + " NO es primo");

        } else {

            System.out.println("El número " + numero + " ES primo");
        }


    }
}

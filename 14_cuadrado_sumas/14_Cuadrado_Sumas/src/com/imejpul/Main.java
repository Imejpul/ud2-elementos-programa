package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int impar = 1;
        int result = 1;

        System.out.println("Introducir valor a calcular");
        String aux = br.readLine();

        int valor = Integer.parseInt(aux);

        System.out.print("Sumandos: 1");

        while (valor > 1){

            impar = impar +2;
            result = result + impar;
            valor --;

            System.out.print(" + " + impar);
        }

        System.out.println(", El resultado es: " +  result);
    }

}

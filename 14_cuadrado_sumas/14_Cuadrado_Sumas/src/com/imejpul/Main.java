package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 1;

        System.out.println("Introducir valor a calcular");

        int valor = Integer.parseInt(br.readLine());

        System.out.print("Sumandos: 1");

        for (int impar = 1; valor > 1; valor--) {

            impar = impar + 2;
            result = result + impar;
            System.out.print(" + " + impar);

        }

        System.out.println(", El resultado es: " + result);
    }

}

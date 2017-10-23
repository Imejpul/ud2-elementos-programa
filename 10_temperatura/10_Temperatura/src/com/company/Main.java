package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        double temp;
        char escala;
        double fah;
        double kel;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introducir tº en ºC");
        temp = Double.parseDouble(br.readLine());

        do {

            System.out.println("Introducir escala a convertir");
            escala = br.readLine().charAt(0);

        } while (escala != 'f' && escala != 'k');

        if (escala == 'f') {

            fah = ((1.8 * temp) + 32);
            System.out.println("La temperatura en ºF es: " + fah);

        } else {

            kel = temp + 273.15;
            System.out.println("La temperatura en ºK es: " + kel);
        }
    }
}

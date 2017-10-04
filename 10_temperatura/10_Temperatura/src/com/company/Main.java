package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        int temp = 0;
        char escala;
        int fah = 0;
        int kel = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



            System.out.println("Introducir tº en ºC");
            String aux = br.readLine();
            temp = Integer.parseInt(aux);

        do{

            System.out.println("Introducir escala a convertir");
            escala = br.readLine().charAt(0);


        }while (escala != 'f' && escala != 'k');

        if (escala == 'f'){

            fah = temp +32;
            System.out.println("La temperatura en ºF es: " + fah);

        } else {

            kel = temp + 273;
            System.out.println("La temperatura en ºK es: " + kel);
        }
    }
}

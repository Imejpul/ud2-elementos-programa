package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introducir nº DNI");

        int numero_dni = Integer.parseInt(br.readLine());

        System.out.println("Introducir Letra DNI");
        String aux2 = br.readLine();
        char letra_dni = aux2.toLowerCase().charAt(0);

        int resto = numero_dni % 23;
        char comparador = '0';

        switch (resto) {
            case 0:
                comparador = 't';
                break;
            case 1:
                comparador = 'r';
                break;
            case 2:
                comparador = 'w';
                break;
            case 3:
                comparador = 'a';
                break;
            case 4:
                comparador = 'g';
                break;
            case 5:
                comparador = 'm';
                break;
            case 6:
                comparador = 'y';
                break;
            case 7:
                comparador = 'f';
                break;
            case 8:
                comparador = 'p';
                break;
            case 9:
                comparador = 'd';
                break;
            case 10:
                comparador = 'x';
                break;
            case 11:
                comparador = 'b';
                break;
            case 12:
                comparador = 'n';
                break;
            case 13:
                comparador = 'j';
                break;
            case 14:
                comparador = 'z';
                break;
            case 15:
                comparador = 's';
                break;
            case 16:
                comparador = 'q';
                break;
            case 17:
                comparador = 'v';
                break;
            case 18:
                comparador = 'h';
                break;
            case 19:
                comparador = 'l';
                break;
            case 20:
                comparador = 'c';
                break;
            case 21:
                comparador = 'k';
                break;
            case 22:
                comparador = 'e';
                break;
        }

        if (comparador == letra_dni) {

            System.out.println("Letra Correcta");

        } else {

            System.out.println("Letra Incorrecta, tu DNI es -mu chano!-");
        }

    }
}

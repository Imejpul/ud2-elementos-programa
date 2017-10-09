package com.imejpul;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = 0;
        char opcion;

        System.out.println("Introducir valor 1: ");
        String aux = br.readLine();
        int valor1 = Integer.parseInt(aux);

        System.out.println("Introducir valor 2: ");
        aux = br.readLine();
        int valor2 = Integer.parseInt(aux);

        System.out.println("---Menú---\n" + "a) Suma\n" + "b) Resta\n" + "c) Multiplicación\n" + "d) División\n" + "e) Resto\n" + "f) Terminar\n");

        do{

            System.out.println("Introducir una opción: ");
            aux = br.readLine();
            opcion = aux.charAt(0);

            switch (opcion){
                case 'a':
                    res = valor1 + valor2;
                    System.out.println("El resultado es: " + res);
                    break;

                case 'b':
                    res = valor1 - valor2;
                    System.out.println("El resultado es: " + res);
                    break;

                case 'c':
                    res = valor1 * valor2;
                    System.out.println("El resultado es: " + res);
                    break;

                case 'd':
                    res = valor1 / valor2;
                    System.out.println("El resultado es: " + res);
                    break;

                case 'e':
                    res = valor1 % valor2;
                    System.out.println("El resultado es: " + res);
                    break;

                case 'f':
                    System.out.println("FIN");
                    break;

                }

        } while ( opcion != 'f' );


    }
}

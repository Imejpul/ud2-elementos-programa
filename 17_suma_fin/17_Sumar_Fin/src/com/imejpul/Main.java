package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int suma = 0;
        String aux;

        do {

            System.out.println("Introducir valor");
            aux = br.readLine();

            if (!aux.equals("fin")) {

                int valor = Integer.parseInt(aux);

                suma = suma + valor;

                if (valor > max) {

                    max = valor;
                }

                if (valor < min) {

                    min = valor;
                }
            }

        } while (!aux.equalsIgnoreCase("fin"));

        System.out.println("La suma total es: " + suma + "\n" + "El valor máximo fue: " + max + " \n" + "El valor mínimo fue: " + min);

    }
}

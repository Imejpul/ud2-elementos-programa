package com.imejpul;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = -2147483647;
        int min = 2147483647;
        int suma = 0;
        String aux = "";



        do {

            System.out.println("Introducir valor");
            aux = br.readLine();

            if (!Objects.equals(aux, "fin")){

                int valor = Integer.parseInt(aux);

                suma = suma + valor;

                if (valor > max) {

                    max = valor;
                }

                if (valor < min) {

                    min = valor;
                }
            }


        } while (!Objects.equals(aux, "fin"));

        System.out.println("La suma total es: " + suma + "\n" + "El valor máximo fue: " + max + " \n" + "El valor mínimo fue: " + min);


    }
}

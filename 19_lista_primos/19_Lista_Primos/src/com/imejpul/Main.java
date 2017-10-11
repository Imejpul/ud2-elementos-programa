package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introducir valor");

        String aux = br.readLine();
        int valor = Integer.parseInt(aux);

        int divisores = 0;
        int contador = 1;
        int posiblePrimo = 2;

        do{

            if (contador <= posiblePrimo){

                if(posiblePrimo % contador == 0){

                    divisores++;
                    contador++;

                } else {

                    contador++;
                }
            } else if (divisores != 2){

                divisores = 0;
                contador = 1;
                posiblePrimo++;

                } else {

                divisores = 0;
                contador = 1;
                System.out.println(posiblePrimo + ", ");
                posiblePrimo++;
                }

        } while (posiblePrimo <= valor);


    }
}

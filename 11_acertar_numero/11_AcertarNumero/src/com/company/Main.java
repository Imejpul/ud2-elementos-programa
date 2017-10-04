package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Random r = new Random();
        int aleatorio = r.nextInt(100);

        int intentos = 0;
        int num = 0;
        String aux = "";

        do {

            System.out.println("Intenta acertar el número. Introduce un número: ");
            aux = br.readLine();

            num = Integer.parseInt(aux);
            intentos++;

            if (num < aleatorio) {

                System.out.println("El número que buscas es más ALTO");

            } else if (num > aleatorio) {

                System.out.println("El número que buscas es más BAJO");
            }else {
                System.out.println("¡Has acertado!");
                break;
            }

        } while (aux != "fin");

        System.out.println("El número de intentos ha sido: " + intentos);







    }
}

package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cont = 100;
        String tipo = "";

        do {
            System.out.println("Par o Impar");
            tipo = br.readLine();

        } while ((!Objects.equals(tipo, "par")) && (!Objects.equals(tipo, "impar")));

        // si se elige par:

        if (Objects.equals(tipo, "par")){

            int num = 0;

            while ( cont > 0 ) {

                num++;
                num++;
                cont--;

                System.out.println("Nº: " + num);
            }

        //si se elige impar:

        } else {

            int num = 1;

            while ( cont > 0 ) {

                num++;
                num++;
                cont--;

                System.out.println("Nº: " + num);
            }
        }


    }
}

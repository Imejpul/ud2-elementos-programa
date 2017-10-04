package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        int valAbs = 0;
        int valor = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {

            System.out.println("Introduce un valor");
            String aux = br.readLine();

            valor = Integer.parseInt(aux);

            if (valor < 0){
                valAbs = valor * (-1);
                System.out.println("El valor absoluto es: " + valAbs);
            }else {
                valAbs = valor;
                System.out.println("El valor absoluto es: " + valAbs);
            }

        } while (valor != 0);



    }
}

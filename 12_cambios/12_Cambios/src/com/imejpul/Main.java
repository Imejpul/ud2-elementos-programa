package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        double prc;
        double cant;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {

            System.out.println("Introducir Precio");
            prc = Integer.parseInt(br.readLine());

        } while (((prc * 100) % 5) != 0);

        do {

            System.out.println("Introducir Pago");
            cant = Integer.parseInt(br.readLine());

        } while ((cant < prc) || (((cant * 100) % 5) != 0));

        //calculamos las cantidades en centimos de €

        int cambio = (int) (cant - prc);
        cambio = cambio * 100;

        //calculamos monedas

        int m2 = cambio / 200;      //monedas 2€
        int resto = cambio % 200;

        int m1 = resto / 100;       //monedas 1€
        resto = resto % 100;

        int m50 = resto / 50;      //monedas 50 ct. €
        resto = resto % 50;

        int m20 = resto / 20;       //monedas 20 ct. €
        resto = resto % 20;

        int m10 = resto / 10;      //monedas 10 ct. €
        resto = resto % 10;

        int m5 = resto / 5;        //monedas 5 Ct. €

        //mostramos los cambios resultantes en cantidad de cada moneda

        System.out.println("El cambio es: " + m2 + " Monedas de 2 €, " + m1 + " moneddas de 1 €, " + m50 +
                " monedas de 50 Ct. €, " + m20 + " monedas de 20 Ct. €, " + m10 + " monedas de 10 Ct. €, " + m5 + " Monedas de 5 Ct. €");

    }
}

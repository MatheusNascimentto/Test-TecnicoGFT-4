package dev.matheus;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Em que turno voce trabalha ? ");
        System.out.println("  M- matutino , V- vespertino ,  N- noturno ");
        String turno = entrada.next().toUpperCase(Locale.ROOT);



        switch (turno) {

            case "M" :
                System.out.println(" M - MATUTINO ");
                break;

            case "V" :
                System.out.println("V - vespertino ");
                break;

            case "N" :
                System.out.println(" N - noturno ");

            default:
                System.out.println("TURNO INVALIDO");


        }



    }
}

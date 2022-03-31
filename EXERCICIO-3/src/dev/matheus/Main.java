package dev.matheus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ida = new Scanner(System.in);
        System.out.println(" Quantos litros de suco ?");
        int litroSuco = ida.nextInt();

        System.out.println(" Qual o tipo de Suco ? L - LIMAO , T - TAMARINDO");
        String tipoSuco = ida.next().toUpperCase();

        ISuco suco = null;
        switch (tipoSuco) {

            case "L" :
                suco = new SucoLimao();
                break;

            case "T" :
                suco = new SucoTamarindo();
                break;

            default:
                System.out.println("TURNO INVALIDO");

        }
        System.out.println(suco.calculaDesconto(litroSuco));
    }
}

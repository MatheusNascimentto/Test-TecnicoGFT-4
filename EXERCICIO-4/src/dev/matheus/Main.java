package dev.matheus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ida = new Scanner(System.in);
        System.out.println(" Quantos anos voce tem ? ");
        int idade = ida.nextInt();
        System.out.println(verificaIdade(idade));
    }

    public static String verificaIdade(int idade) {
        if (idade >= 18 && idade <= 67) {
            return "Pode doar sangue";
        } else {
            return "Nao pode doar sangue";
        }

    }

}

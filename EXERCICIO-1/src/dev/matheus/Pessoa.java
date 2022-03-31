package dev.matheus;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int datanasc;
    private float altura;

    private float anoAtual;
    private float idade;


    public void calcularIdade() {
        Scanner ida = new Scanner(System.in);
        System.out.print(" Digite seu nome :" );
        nome = ida.nextLine();
        System.out.println("--------------------------------");
        System.out.print("Em que ano nos estamos ? ");
        anoAtual = ida.nextFloat();
        System.out.println("--------------------------------");
        System.out.print(" Que ano voce nasceu ? ");
        datanasc = ida.nextInt();
        System.out.println("--------------------------------");
        float actual = this.anoAtual - this.datanasc;

        idade = actual;

        System.out.println(" Seu nome é " + nome);
        System.out.println(" Sua idade é " + idade);

    }

    public float getIdade() {
        return idade;
    }

    public void setIdade(float idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(int datanasc) {
        this.datanasc = datanasc;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", datanasc=" + datanasc +
                ", altura=" + altura +
                ", idade=" + idade +
                '}';
    }
}

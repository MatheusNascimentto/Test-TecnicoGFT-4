package dev.matheus;

public class SucoTamarindo implements ISuco {

    @Override
    public String calculaDesconto(int quantidadeLitro) {
        if (quantidadeLitro <= 2) {
            return "DESCONTO DE 4% POR LITRO";
        } else if (quantidadeLitro > 5) {
            return "DESCONTO DE 6% POR LITRO";
        } else {
            return "NAO TERA DESCONTO";
        }
    }
}

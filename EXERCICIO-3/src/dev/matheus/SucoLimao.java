package dev.matheus;

public class SucoLimao implements ISuco {


    @Override
    public String calculaDesconto(int quantidadeLitro) {
        if (quantidadeLitro <= 2) {
            return "DESCONTO DE 3% POR LITRO";
        } else if (quantidadeLitro > 5) {
            return "DESCONTO DE 5% POR LITRO";
        } else {
            return "NAO TERA DESCONTO";
        }
    }

}

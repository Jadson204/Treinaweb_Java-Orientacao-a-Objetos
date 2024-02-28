package br.com.treinaweb.javaoo.main;

import br.com.treinaweb.javaoo.classes.Carro;
import br.com.treinaweb.javaoo.classes.Veiculo;

public class Main {
    public static void main(String[] args) {
        try {
            Carro corsa = new Carro();
            corsa.setMarca("GM");
            corsa.setNome("Corsa");
            corsa.setChassi("ABCDE");
            corsa.abastecer(10);
            System.out.println(corsa.getNome());
            System.out.println(corsa.getQuantidadeCombustivel());
            corsa.ligar();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

        Veiculo celta = new Veiculo();
        celta.setMarca("GM");
        celta.setNome("Celta");
        celta.abastecer(15);
        System.out.println(celta.getNome());
        System.out.println(celta.getQuantidadeCombustivel());
        celta.ligar();
    }
}
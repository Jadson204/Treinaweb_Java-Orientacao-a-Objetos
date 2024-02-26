package br.com.treinaweb.javaoo.main;

import br.com.treinaweb.javaoo.classes.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo corsa = new Veiculo();
        corsa.setMarca("GM");
        corsa.setNome("Corsa");
        corsa.ligar();
        System.out.println(corsa.getNome());

        Veiculo celta = new Veiculo();
        celta.setMarca("GM");
        celta.setNome("Celta");
        celta.ligar();
        System.out.println(celta.getNome());
    }
}
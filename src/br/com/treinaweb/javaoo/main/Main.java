package br.com.treinaweb.javaoo.main;

import br.com.treinaweb.javaoo.classes.Carro;
import br.com.treinaweb.javaoo.classes.Moto;
import br.com.treinaweb.javaoo.classes.Veiculo;
import br.com.treinaweb.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.ChassiInvalidoException;

public class Main {
    public static void main(String[] args) {
        try {
//            Carro corsa = new Carro();
//            corsa.setMarca("GM");
//            corsa.setNome("Corsa");
            Veiculo corsa = new Carro("Corsa", "GM");
            corsa.setChassi("ABCDE");
            corsa.abastecer(10);
            ((Carro) corsa).setQuantidadePortas(4);
            System.out.println(corsa.getNome());
            System.out.println(corsa.getQuantidadeCombustivel());
            System.out.println(corsa.getQuantidadeRodas());
            System.out.println(String.format("O veículo %s está ligado? %s", corsa.getNome(), corsa.isLigado() ? "Sim" : "Não"));
            corsa.abastecer(10);
            corsa.ligar();

//            Moto fazer = new Moto();
//            fazer.setMarca("Yamaha");
//            fazer.setNome("Fazer");
        } catch (AbastecimentoVeiculoLigadoException e) {
            System.out.println("Você não pode abastecer um veículo enquanto ele estiver ligado");
        } catch (ChassiInvalidoException e) {
            System.out.println("O chassi é inválido. " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
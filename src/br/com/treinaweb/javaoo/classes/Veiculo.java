package br.com.treinaweb.javaoo.classes;

import br.com.treinaweb.javaoo.excecoes.*;

public class Veiculo {

    private String nome;
    private String marca;
    private String chassi;
    protected int quantidadeRodas;
    private float quantidadeCombustivel;
    private Boolean ligado;
    protected float velocidade;

    public Veiculo() {
        this.ligado = false;
        this.velocidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) throws Exception {
        if(chassi.length() == 5) {
            this.chassi = chassi;
        } else {
            throw new ChassiInvalidoException(chassi);
        }
    }

    public Boolean isLigado() {
        return ligado;
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }


    public float getVelocidade() {
        return velocidade;
    }

    public void ligar() {
        this.ligado = true;
        this.velocidade = 0;
        System.out.println("O veículo ligou!!!");
    }

    public void desligar() {
        this.ligado = false;
        this.velocidade = 0;
        System.out.println("O veículo desligou!!!");
    }

    public void abastecer(float litros) throws AbastecimentoVeiculoLigadoException {
        if(!this.ligado) {
            quantidadeCombustivel += litros;
        } else {
            throw new AbastecimentoVeiculoLigadoException();
        }
    }

    public void acelerar() throws AceleracaoVeiculoLigadoException{
        if(this.ligado) {
            this.velocidade += 10;
        } else {
            throw new AceleracaoVeiculoLigadoException();
        }
    }

    public void frear() throws FrenagemVeiculoDesligadoException {
        if (this.ligado && this.velocidade > 0) {
            this.velocidade -= 10;
        } else {
            throw new FrenagemVeiculoDesligadoException();
        }
    }

}

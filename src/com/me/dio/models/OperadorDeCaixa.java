package com.me.dio.models;

public class OperadorDeCaixa  extends  FuncionarioCLT{
    public OperadorDeCaixa() {
    }

    public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", ValorSalario=" + ValorSalario +
                ", endereco=" + endereco.getRua() +
                '}';


    }
}

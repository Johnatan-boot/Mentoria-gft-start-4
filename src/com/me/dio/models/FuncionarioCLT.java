package com.me.dio.models;

public abstract class FuncionarioCLT {
    //abstract=> Identifica uma classe como base = Mae
    // que atribui caracteristicas

    protected  String nome;
    protected  String documento;
    protected  Double ValorSalario;
    protected  Endereco endereco;

    public FuncionarioCLT() {
    }

    public FuncionarioCLT(String nome, String documento, Double valorSalario, Endereco endereco) {
        this.nome = nome;
        this.documento = documento;
        ValorSalario = valorSalario;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Double getValorSalario() {
        return ValorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        ValorSalario = valorSalario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

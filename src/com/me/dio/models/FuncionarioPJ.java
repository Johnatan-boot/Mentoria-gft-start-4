package com.me.dio.models;

public abstract class FuncionarioPJ{
    private String nome;
    private String documento;
    private Endereco endereco;
    public  Integer horasTrabalhadas;
    private Double ValorHora;
    private Double ValorRemuneracao;

    //Formula calculo Salario PJ
    public  void calculaRemuneracao(){
        this.ValorRemuneracao = this.horasTrabalhadas * this.ValorHora;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Double getValorHora() {
        return ValorHora;
    }

    public void setValorHora(Double valorHora) {
        ValorHora = valorHora;
    }

    public Double getValorRemuneracao() {
        return ValorRemuneracao;
    }

    public void setValorRemuneracao(Double valorRemuneracao) {
        ValorRemuneracao = valorRemuneracao;
    }


}

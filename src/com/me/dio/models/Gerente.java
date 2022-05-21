package com.me.dio.models;

public class Gerente extends  FuncionarioPJ implements CalculaBonificacao{
    //Campo Calculavel
    private  Double ValorBonificacao;
    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
    this.ValorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao/100)+100);
    }
    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" +  super.getDocumento() + '\'' +
                ", endereco=" +  super.getEndereco() +
                ", horasTrabalhadas=" +  super.getHorasTrabalhadas() +
                ", ValorHora=" +  super.getValorHora() +
                ", ValorRemuneracao=" +  super.getValorRemuneracao() +
                ", ValorBonificacao=" +  this.ValorBonificacao +

                '}';
    }


}

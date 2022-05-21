package com.me.dio.models;

public class Vendedor  extends  FuncionarioCLT implements CalculaBonificacao{
    private  Double valorDaBonificacao;
    //extends -> indentifica uma class como herdada da classe mae
    //classe funcionarioclt

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        //Formula Para Calcular uma Bonificação de Vendedor e Gerente
     this.valorDaBonificacao = this.ValorSalario * (porcentagemBonificacao/100d);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", ValorSalario=" + ValorSalario +
                ", endereco=" + endereco.getBairro() +
                ", ValorDaBonificacao=" + valorDaBonificacao +
                '}';
    }


}

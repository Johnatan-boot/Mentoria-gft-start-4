package com.me.dio.models;

public interface CalculaBonificacao {
    //Criada pq todas as classes que precisar calcular
   // bonificacao vai precisar implementar esta interface
    void  calculaBonificacao(Double porcentagemBonificacao);
}

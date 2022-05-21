package com.me.dio;

import com.me.dio.models.Endereco;
import com.me.dio.models.Gerente;
import com.me.dio.models.OperadorDeCaixa;
import com.me.dio.models.Vendedor;

public class Main {

    public static void main(String[] args) {
	   /* Endereco endereco = new Endereco();endereco.setRua("Endeereço Para Esta Rua");
      //Retornando o endereço System.out.println(endereco.getRua());
	    * */

        String rua = "Erico Verissimo";
        String complemento="Complemento Endereço do funcionario";
        String bairro = "Bairro do funcionario";
        Endereco endereco = new Endereco(rua,complemento,bairro);
        System.out.println("-----------");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Johnatan Quenes Santos");
        vendedor.setDocumento("123.456.789-00");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);
        System.out.println("-----------");


        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa(
                "Johnatan Op Caixa",
                "789.456.123-00",
                2000d,
                endereco
        );
        System.out.println(operadorDeCaixa);

        System.out.println("-----------");

        Gerente gerente = new Gerente();
        gerente.setNome("Joao Pedro Gerente");
        gerente.setDocumento("456.123.789-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);
        gerente.calculaRemuneracao();

        gerente.calculaBonificacao(3d);
        System.out.println(gerente);















    }
}

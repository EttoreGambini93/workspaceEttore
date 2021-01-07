package br.com.concessionariaxyz.aplicacao;

import br.com.concessionariaxyz.modelo.Veiculo;

public class AplicacaoVeiculo {

	public static void main(String[] args) {
		
		Veiculo objeto = new Veiculo();
		objeto.preencherMontadora("FIAT");
		objeto.preencherModelo("UNO");
		objeto.preencherValor(30000);
		objeto.preencherVelocidadeMaxima(180);
		
		System.out.println(objeto.retornarMontadora());
		System.out.println(objeto.retornarModelo());
		System.out.println(objeto.retornarValor());
		System.out.println(objeto.retornarVelocidadeMaxima());	
		
		System.out.println(objeto.ligar());
		
		objeto.acelerar(20);
		objeto.acelerar();
		objeto.acelerar(50);
		System.out.println(objeto.verificarStatus());
		objeto.desacelerar();
		objeto.desacelerar();
		System.out.println(objeto.verificarStatus());
		
		System.out.println(objeto.desligar());
		objeto.acelerar();
		System.out.println(objeto.verificarStatus());
	}

}

package br.com.elevadoreszyx.apicacao;

import br.com.elevadoreszyx.modelo.Elevador;

public class AplicacaoElevador {

	public static void main(String[] args) {
		Elevador objeto = new Elevador();
		
		objeto.inicializar((short)10,(short) 5,(short) -2);
		
		System.out.println(objeto.verificarStatus());
		objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.subir();
		System.out.println(objeto.verificarStatus());
		objeto.descer();
		objeto.descer();
		objeto.descer();
		objeto.descer();
		objeto.descer();
		objeto.descer();
		objeto.descer();
		System.out.println(objeto.verificarStatus());

	}

}

package br.com.elevadoreszyx.modelo;

public class Elevador {

	private short capacidadeMaxima;
	private short andarMaximo;
	private short andarMinimo;
	private short qtdePessoas;
	private short andarAtual;

	public void inicializar (short capacidade, short maior, short menor) {
		capacidadeMaxima=capacidade;
		andarMaximo=maior;
		andarMinimo=menor;

	}

	public String verificarStatus() {
		return "Capacidade Máxima: " + capacidadeMaxima +"\n" + 
				"Quantidade de Pessoas: " + qtdePessoas + "\n" + 
				"Andar Atual: " + andarAtual;
	}

	public void subir() {
		if(andarAtual<andarMaximo) {
			andarAtual+=1;
		}
	}

	public void descer() {
		if(andarAtual>andarMinimo)
			andarAtual-=1;
	}

	public void entrar(short qtde) {
		if((qtdePessoas+qtde)<capacidadeMaxima) {
			qtdePessoas+=qtde;
		}
	}
	public void sair(short qtde) {
		if((qtdePessoas+qtde)>0) {
			qtdePessoas-=qtde;
		}
	}
	public void sair() {
		if(qtdePessoas>0) {
			qtdePessoas-=1;
		}
	}
}

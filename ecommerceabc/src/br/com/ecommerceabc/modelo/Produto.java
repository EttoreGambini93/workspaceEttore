package br.com.ecommerceabc.modelo;

public class Produto {
	private int id;
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int qtde;
	
	public String getAll() {
		return 
				"ID: " + id + "\n" +
				"Descrição: " + descricao + "\n" +
				"Valor de Venda: " + valorVenda + "\n" +
				"Valor de Compra: " + valorCompra + "\n" +
				"Quandidade: " + qtde + "\n"; 
	}
	
	public void setAll(int id, String descricao, float valorVenda, float valorCompra, int qtde) {
	
	}
	
	public float getPromocao() {
		return (float) (valorVenda*0.9);
	}
	
	public float getTotalVendas() {
		return qtde*valorVenda;
	}
	
	public float getTotalCompras() {
		return qtde*valorCompra;
	}
	
	public void atualizarValores(float porcentagem) {
		valorVenda+=(valorVenda*porcentagem)/100;
		valorCompra+=(valorCompra*porcentagem)/100;
	}
	
	public String verificarEstoque() {
		if(qtde>20) {
		return "Estoque Alto";
		}
		else if(qtde<5) {
			return "Estoque Baixo";
		}
		else 
			return "Estoque Normal";
	}
	
	public float getPromocao(float porcentagem) {
		return valorVenda-=(valorVenda*porcentagem);
	}
}

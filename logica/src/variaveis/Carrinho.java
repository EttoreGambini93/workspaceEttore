package variaveis;

import javax.swing.JOptionPane;

public class Carrinho {

	public static void main(String[] args) {
		String nome_produto = JOptionPane.showInputDialog("Digite o nome do produto:");
		String categoria = JOptionPane.showInputDialog("Digite a categoria do produto:");
		double valor_prod = Double.parseDouble(JOptionPane.showInputDialog("Digite preço do produto:"));;
		int qtd_prod = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto:"));;
		double imp_prod = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do imposto do produto:"));;
		double total_semimp = valor_prod * qtd_prod;
		double total_comimp = ((valor_prod * imp_prod / 100) + valor_prod) * qtd_prod;
		double total_soimp = (valor_prod * imp_prod / 100) * qtd_prod;
		double total_comipedesc = total_comimp - (total_comimp * 0.1);
		
		System.out.println("Nome do Produto: " + nome_produto);
		System.out.println("Categoria: " + categoria);
		System.out.println("Preço: R$" + valor_prod);
		System.out.println("Quantidade: " + qtd_prod);
		System.out.println("Imposto: " + imp_prod + "%");
		System.out.println("Total Sem Imposto: " + total_semimp);
		System.out.println("Total com Imposto: " + total_comimp);
		System.out.println("Valor do Imposto: " + total_soimp);
		System.out.println("Total com Imposto e 10% de Desconto " + total_comipedesc);

	}

}

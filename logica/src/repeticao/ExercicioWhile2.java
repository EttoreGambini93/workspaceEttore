package repeticao;

import javax.swing.JOptionPane;

public class ExercicioWhile2 {

	public static void main(String[] args) {

		String nome;
		String nome_exp = null;
		String nome_jovem = null;
		int idade = 0;
		int idade_exp = 0;
		int idade_jovem = 100;
		int idade_total = 0;
		int idade_maior = 0;
		int qtd_pessoas = 0;
		int media_idade =0;

		do {
			nome = JOptionPane.showInputDialog("Nome: ");
			idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
			if(idade>=18) {
				idade_maior++;
			}
			idade_total+=idade;
			qtd_pessoas++;
			if (idade>idade_exp) {
				idade_exp=idade;
				nome_exp=nome;
			}
			if(idade==0) {
				idade_jovem=idade;
				nome_jovem=nome;
			}else if(idade<idade_jovem) {
				idade_jovem=idade;
				nome_jovem=nome;
			}
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);
		System.out.println("Maiores de Idade: " + idade_maior);
		System.out.println("M�dia das Idades: " + (media_idade = idade_total/qtd_pessoas));
		System.out.println("Pessoa Experiente: " + nome_exp + " com " + idade_exp);
		System.out.println("Pessoa Jovem: " + nome_jovem + " com " + idade_jovem);
	}

}

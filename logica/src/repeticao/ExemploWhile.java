package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome :");
		while (nome.length()<5 || nome.length()>20 || nome.contains(" ")==false ){
			nome = JOptionPane.showInputDialog("Digite Nome Novamente :");
		}
		
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade :"));
		while (idade<18 || idade>80) {
			idade = Short.parseShort(JOptionPane.showInputDialog("Digite a Idade Novamente :"));
		}
		
		System.out.println("Nome Completo: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sobrenome: " + nome.substring(nome.indexOf(" ")));
		
	}

}

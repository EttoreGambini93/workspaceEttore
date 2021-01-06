package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		/* 
		 * boolean -> True or False
		 * char -> 1 caracter
		 */
		
		String materia = JOptionPane.showInputDialog("Digite o nome da matéria:");
		float notas1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do 1º Semestre:"));
		float notas2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do 2º Semestre:"));
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite o número de faltas"));
		float media = (notas1 + notas2) / 2;
		
		System.out.println("Matéria: " + materia);
		System.out.println("Notas 1º Semestre: " + notas1);
		System.out.println("Notas 2º Semestre: " + notas2);
		System.out.println("Média: " + media);
		System.out.println("Faltas: " + faltas);
	}

}

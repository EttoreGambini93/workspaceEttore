package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		/* 
		 * boolean -> True or False
		 * char -> 1 caracter
		 */
		
		String materia = JOptionPane.showInputDialog("Digite o nome da mat�ria:");
		float notas1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do 1� Semestre:"));
		float notas2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do 2� Semestre:"));
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite o n�mero de faltas"));
		float media = (notas1 + notas2) / 2;
		
		System.out.println("Mat�ria: " + materia);
		System.out.println("Notas 1� Semestre: " + notas1);
		System.out.println("Notas 2� Semestre: " + notas2);
		System.out.println("M�dia: " + media);
		System.out.println("Faltas: " + faltas);
	}

}

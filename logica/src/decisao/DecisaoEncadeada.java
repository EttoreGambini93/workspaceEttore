package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		String disciplina = JOptionPane.showInputDialog("Disciplina: ");
		short falta = Short.parseShort(JOptionPane.showInputDialog("Faltas"));
		if (falta>=20) {
			System.out.println("Infelizmente voc� n�o foi aprovado");
			System.out.println("Disciplina: " + disciplina);
			System.out.println("Faltas: " + falta);
		}else {
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
			float media = (nota1+nota2)/2;

			if (media>=6) {
				System.out.println("Parab�ns voc� foi aprovado");
				System.out.println("Disciplina: " + disciplina);
				System.out.println("M�dia: " + media);
				System.out.println("Faltas: " + falta);
			}
			else if (media<4) {
				System.out.println("Infelizmente voc� n�o foi aprovado");
				System.out.println("Disciplina: " + disciplina);
				System.out.println("M�dia: " + media);
				System.out.println("Faltas: " + falta);
			}
			else {
				System.out.println("Voc� ficou de exame");
				System.out.println("Disciplina: " + disciplina);
				System.out.println("M�dia: " + media);
				System.out.println("Faltas: " + falta);
			}
		}
	}
}
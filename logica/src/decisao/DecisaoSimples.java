package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		
		String disciplina = JOptionPane.showInputDialog("Disciplina: ");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		float media = (nota1+nota2)/2;
		
		if (media>=6) {
			System.out.println("Parab�ns voc� foi aprovado");
			System.out.println("Discip�ina: " + disciplina);
			System.out.println("M�dia: " + media);
		}
		if (media<=4) {
			System.out.println("Infelizmente voc� n�o foi aprovado");
			System.out.println("Discip�ina: " + disciplina);
			System.out.println("M�dia: " + media);
		}
		if (media>4 && media <6) {
			System.out.println("Voc� ficou de exame");
			System.out.println("Discip�ina: " + disciplina);
			System.out.println("M�dia: " + media);
		}	
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}

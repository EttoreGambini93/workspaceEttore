package Exercicios;

import javax.swing.JOptionPane;

public class Exerc3 {

	public static void main(String[] args) {

		char conceito;
		double mp = 0;
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota Trabalho: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota Semestral: (N�o pode ser igual � anterior)"));
		if (nota2!=nota1) {		
			double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Nota Exame Final: (N�o pode ser igual � anterior)"));
			if (nota3!=nota2 && nota3!=nota1) {
				mp = (double) ((nota1*2 + nota2*3 + nota3*5) / 10);

				if (mp>=8 && mp<=10) {
					conceito = 'A';
				}else if(mp>=7 && mp<=7.9) {
					conceito = 'B';
				}else if(mp>=6 && mp<=6.9) {
					conceito = 'C';
				}else if(mp>=5 && mp<=5.9) {
					conceito = 'D';
				}else {
					conceito = 'E';
				}

				System.out.println("M�dia: " + mp);
				System.out.println("Nota Conceito: " + conceito);
			}
			else System.out.println("N�MERO IGUAL");
		}
		else System.out.println("N�MERO IGUAL");
	}

}

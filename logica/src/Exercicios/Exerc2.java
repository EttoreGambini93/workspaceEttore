package Exercicios;

import javax.swing.JOptionPane;

public class Exerc2 {

	public static void main(String[] args) {

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2: "));
		int result = 0;
		String oper = JOptionPane.showInputDialog("Qual a opera��o desejada? Escolha entre Soma, Subtra��o, Multiplica��o ou Divis�o ");

		if (oper.equals("Soma")) {
			result = valor1 + valor2;
		}else if (oper.equals("Subtra��o")){
			result = valor1 - valor2;
		}else if(oper.equals("Multipla��o")){
			result = valor1 * valor2;
		}else if(oper.equals("Divis�o")){
			result = valor1 / valor2;
		}
		System.out.println("Resultado: " + result);
	}

}
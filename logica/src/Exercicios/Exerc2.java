package Exercicios;

import javax.swing.JOptionPane;

public class Exerc2 {

	public static void main(String[] args) {

		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2: "));
		int result = 0;
		String oper = JOptionPane.showInputDialog("Qual a operação desejada? Escolha entre Soma, Subtração, Multiplicação ou Divisão ");

		if (oper.equals("Soma")) {
			result = valor1 + valor2;
		}else if (oper.equals("Subtração")){
			result = valor1 - valor2;
		}else if(oper.equals("Multiplação")){
			result = valor1 * valor2;
		}else if(oper.equals("Divisão")){
			result = valor1 / valor2;
		}
		System.out.println("Resultado: " + result);
	}

}

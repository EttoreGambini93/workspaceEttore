package Exercicios;

import javax.swing.JOptionPane;

public class Exerc1 {

	public static void main(String[] args) {

		String nome_cliente = JOptionPane.showInputDialog("Nome Cliente: ");
		short diaria = Short.parseShort(JOptionPane.showInputDialog("Qtd Di�rias: "));
		short preco = 80;
		short total;

		if (diaria>15) {
			total = (short) ((preco + 5.5) * diaria);
		}else if (diaria==15){
			total = (short) ((preco + 6) * diaria);
		}else {
			total = (short) ((preco + 8) * diaria);
		}
		System.out.println("Reserva: " + nome_cliente);
		System.out.println("Total: " + total);
	}

}

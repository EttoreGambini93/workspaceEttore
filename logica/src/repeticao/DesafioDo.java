package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		int i = 0;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("N�mero � ser adivinhado: "));
		do {
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Adivinhe o n�mero: "));
			if(num2<num1) {
				JOptionPane.showMessageDialog(null, "N�mero � maior");
				i++;
			}else if(num2>num1) {
				JOptionPane.showMessageDialog(null, "N�mero � menor");
				i++;
			}else i++;
		}while(num2!=num1); {
			JOptionPane.showMessageDialog(null, "Parab�ns! Voc� acertou. Tentativas: " + i);
		}


	}

}
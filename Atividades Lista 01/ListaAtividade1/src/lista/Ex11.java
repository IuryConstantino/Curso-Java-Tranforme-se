package lista;

import javax.swing.JOptionPane;

/*11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação
do segundo grau e mostre o valor de Delta.*/



public class Ex11 {

	public static void main(String[] args) {
	
		int valorA = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
		int valorB = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
		int valorC = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C: "));
		
		  int formula = valorB * valorB;
		int delta = formula - (4 * valorA * valorC);
		
		JOptionPane.showMessageDialog(null, "O valor de A é: " + valorA);
		JOptionPane.showMessageDialog(null, "O valor de B é: " + valorB);
		JOptionPane.showMessageDialog(null, "O valor de C é: " + valorC);
		JOptionPane.showMessageDialog(null, "Assim, o valor de Delta é: " + delta);
		
		

	}

}
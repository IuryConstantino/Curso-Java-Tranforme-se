package lista;

import javax.swing.JOptionPane;

/*12) Crie um programa que leia o preço de um produto, calcule e mostre o
seu PREÇO PROMOCIONAL, com 5% de desconto.*/



public class Ex12 {

	public static void main(String[] args) {
		
		double produto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
		double desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do desconto: "));
		
		double desc = produto * desconto / 100;
		double total = produto - desc;
		
		JOptionPane.showMessageDialog(null, "O valor do produto é:R$ " + produto + ",00");
		JOptionPane.showMessageDialog(null, "O valor do desconto é: " + desconto + "%");
		JOptionPane.showMessageDialog(null, "O valor PROMOCIONAL é:R$ " + total + " ,00");

	}

}
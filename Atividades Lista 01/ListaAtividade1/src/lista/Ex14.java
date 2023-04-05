package lista;

import javax.swing.JOptionPane;

/*14) A locadora de carros precisa da sua ajuda para cobrar seus serviços.
Escreva um programa que pergunte a quantidade de Km percorridos por
um carro alugado e a quantidade de dias pelos quais ele foi alugado.
Calcule o preço total a pagar, sabendo que o carro custa R$90 por dia e
R$0,20 por Km rodado.*/



public class Ex14 {

	public static void main(String[] args) {
		
		int KM = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de KM percorrido: "));
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias: "));
		  
		double total = (90 * dias) + (0.20 * KM);
		
		JOptionPane.showMessageDialog(null, "A quantidade de KM percorrido é: " + KM + "km");
		JOptionPane.showMessageDialog(null, "O valor total é: R$ " + total + " ,00");
		
	}


}
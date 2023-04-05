package lista;

import javax.swing.JOptionPane;

/*10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o
serviço, sabendo que cada litro de tinta pinta uma área de 2metros
quadrados.*/



public class Ex10 {

	public static void main(String[] args) {

		double largura = Double.parseDouble(JOptionPane.showInputDialog("Informe a largura da parede: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura da parede: "));
		double areaParede = largura * altura;
		double litrosTinta = areaParede / 2;
	
		JOptionPane.showMessageDialog(null, "A área a ser pintada é de " + areaParede
			+ "m² e a quantidade de tinta necessária é de " + litrosTinta + " litros.");
	
	  }
	
	}
	
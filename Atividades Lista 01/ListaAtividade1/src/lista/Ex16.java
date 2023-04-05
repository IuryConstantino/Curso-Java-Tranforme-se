package lista;

import javax.swing.JOptionPane;

/*16) [DESAFIO] Escreva um programa para calcular a redução do tempo de
vida de um fumante. Pergunte a quantidade de cigarros fumados por dias e
quantos anos ele já fumou. Considere que um fumante perde 10 min de
vida a cada cigarro. Calcule quantos dias de vida um fumante perderá e
exiba o total em dias.*/



public class Ex16 {

	public static void main(String[] args) {
  
	  String input = JOptionPane.showInputDialog("Quantos cigarros você fuma por dia?");
	  int cigarrosPorDia = Integer.parseInt(input);
  
	  input = JOptionPane.showInputDialog("Quantos anos você fuma?");
	  int anosFumados = Integer.parseInt(input);
  
	  int totalCigarrosFumados = cigarrosPorDia * 365 * anosFumados;
  
	  int reducaoDeVidaDias = totalCigarrosFumados * 10;
  
	  JOptionPane.showMessageDialog(null, "A redução esperada da sua vida é de " + reducaoDeVidaDias + " dias.");
	}
  
  }
  
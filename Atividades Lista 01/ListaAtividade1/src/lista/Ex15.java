package lista;

import javax.swing.JOptionPane;

/*15) Crie um programa que leia o número de dias trabalhados em um mês e
mostre o salário de um funcionário, sabendo que ele trabalha 8 horas por
dia e ganha R$25 por hora trabalhada.*/



public class Ex15 {

	public static void main(String[] args) {
  
	  String dias = JOptionPane.showInputDialog("Quantos dias o funcionário trabalhou no mês?");
	  int diasTrabalhados = Integer.parseInt(dias);
  
	  double salario = diasTrabalhados * 8 * 25;
  
	  JOptionPane.showMessageDialog(null, "O salário do funcionário é de R$" + salario);
  
	}
  
  }
  
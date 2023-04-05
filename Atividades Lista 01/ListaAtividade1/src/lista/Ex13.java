package lista;

import javax.swing.JOptionPane;

/*13) Faça um algoritmo que leia o salário de um funcionário, calcule e
mostre o seu novo salário, com 15% de aumento.*/



public class Ex13 {

	public static void main(String[] args) {
  
	  double salario, novoSalario;
  
	  salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário:"));
  
	  novoSalario = salario + (salario * 0.15);
  
	  JOptionPane.showMessageDialog(null, "O salário do funcionário com 15% de aumento é de: R$ " + novoSalario);
	}
  
  }
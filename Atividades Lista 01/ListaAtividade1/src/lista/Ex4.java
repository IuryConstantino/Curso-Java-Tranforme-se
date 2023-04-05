package lista;

import javax.swing.JOptionPane;

/*4) Desenvolva um algoritmo que leia dois números inteiros e mostre o
somatório entre eles.
Ex: Digite um valor: 8 Digite outro valor: 5 A soma entre 8 e 5 é igual a 13.*/



public class Ex4 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
		
		int soma = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "A soma dos números  é: " + soma);

	}

}

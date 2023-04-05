package lista;

import javax.swing.JOptionPane;

/*5) Faça um programa que leia as duas notas de um aluno em uma matéria
e mostre na tela a sua média na disciplina.
Ex: Nota 1: 4.5 Nota 2: 8.5 A média entre 4.5 e 8.5 é igual a 6.5*/



public class Ex5 {

	public static void main(String[] args) {
		
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
		
		float media = (nota1 + nota2) / 2;
		
		JOptionPane.showMessageDialog(null, "A média do aluno é: " + media);


	}

}
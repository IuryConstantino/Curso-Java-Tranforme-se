package lista;

import javax.swing.JOptionPane;

/*2) Faça um programa que leia o nome de uma pessoa e mostre uma
mensagem de boasvindas para ela:
Ex: Qual é o seu nome? João da Silva Olá João da Silva, é um prazer te
conhecer! */



public class Ex2 {

    public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual  seu nome?");
		
		JOptionPane.showMessageDialog(null, " Olá " + nome + " , é um prazer te conhecer.");
		

	}

}
    

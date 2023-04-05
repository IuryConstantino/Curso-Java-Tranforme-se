package lista;

import javax.swing.JOptionPane;

/*6) Faça um programa que leia um número inteiro e mostre o seu antecessor
e seu sucessor.
Ex: Digite um número: 9 O antecessor de 9 é 8 O sucessor de 9 é 10*/



public class Ex6 {public static void main(String[] args) {

    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

    int antecessor = numero - 1;
    int sucessor = numero + 1;

    JOptionPane.showMessageDialog(null,
        "O antecessor de " + numero + " é: " + antecessor + "\nO sucessor de " + numero + " é: " + sucessor);
  }
}
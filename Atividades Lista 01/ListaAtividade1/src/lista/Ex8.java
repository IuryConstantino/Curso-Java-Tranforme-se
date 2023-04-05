package lista;

import javax.swing.JOptionPane;

/*6) Faça um programa que leia um número inteiro e mostre o seu antecessor
e seu sucessor.
Ex: Digite um número: 9 O antecessor de 9 é 8 O sucessor de 9 é 10*/



public class Ex8 {

  public static void main(String[] args) {

    double metros, centimetros, milimetros, decimetros;

    metros = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em metros: "));

    centimetros = metros * 100;

    milimetros = metros * 1000;

    decimetros = metros * 10;

    JOptionPane.showMessageDialog(null, "Medida em metros: " + metros + "\n"
        + "Medida em centímetros: " + centimetros + "\n"
        + "Medida em milímetros: " + milimetros + "\n"
        + "Medida em decímetros: " + decimetros);

  }

}

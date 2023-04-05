package lista;

import javax.swing.JOptionPane;

/*8) Desenvolva um programa que leia uma distância em metros e mostre os
valores relativos em outras medidas.*/



public class Ex7 {

  public class Exercicio {

    public static void main(String[] args) {

      double numero, dobro, tP;

      numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real:"));

      dobro = numero * 2;
      tP = numero / 3;

      JOptionPane.showMessageDialog(null, "O dobro do número digitado é " + dobro + " e a terça parte é " + tP);

    }

  }

}

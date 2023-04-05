package lista;

import javax.swing.JOptionPane;

/*9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira
(em R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 =
R$3,45*/



public class Ex9 {
  public static void main(String[] args) {
    double cotacao, dinheiro, dolar;
    String aux;

    aux = JOptionPane.showInputDialog("Digite a cotação do dólar:");
    cotacao = Double.parseDouble(aux);

    aux = JOptionPane.showInputDialog("Quanto dinheiro você tem na carteira em reais ?");
    dinheiro = Double.parseDouble(aux);

    dolar = dinheiro / cotacao;

    JOptionPane.showMessageDialog(null, "Você pode comprar " + dolar + " dólares");
  }
}
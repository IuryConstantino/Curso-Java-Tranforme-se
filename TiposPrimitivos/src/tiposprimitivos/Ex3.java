package tiposprimitivos;

import javax.swing.JOptionPane;

public class Ex3 {
    public static void main(String[] args) {
       String nome = JOptionPane.showInputDialog("Qual o seu Nome?");
       double salario =  Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário?"));

       JOptionPane.showInputDialog(" Olá " + nome + " é um prazer te conhecer!"
                                                + "\n  O salário digitado foi: " + salario);

    }
    
}
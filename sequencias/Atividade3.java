package Atividade.sequencias;

import javax.swing.JOptionPane;

public class Atividade3 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário?"));      
        JOptionPane.showMessageDialog(null, "Olá " +nome+ " É um prazer te conhecer! "
                                + "\n O Salário digitado foi: " +salario);
    }
    
}/* Aula 4 43:23*/
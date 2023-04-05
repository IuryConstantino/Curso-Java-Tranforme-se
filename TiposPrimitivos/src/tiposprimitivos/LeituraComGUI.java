package tiposprimitivos;

import javax.swing.JOptionPane;

public class LeituraComGUI {
    public static void main(String[] args) {
        int idade = 0;
        String aux = JOptionPane.showInputDialog(null, "Insira uma idade ");

        idade = Integer.parseInt(aux);

        JOptionPane.showMessageDialog(null, "Idade Digitada: " + idade);

        /*1:20 
        Aula 3*/ 

        
    }
     
}
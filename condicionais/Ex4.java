package Atividade.condicionais;

import java.util.Scanner;



public class Ex4 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Digite a primeira nota: ");
       double nota1 =scan.nextDouble();
       System.out.print("Digite a segunda nota: ");
       double nota2 =scan.nextDouble();
     
       double media = (nota1 +nota2) /2;
       System.out.println("Média: " +media);
       System.out.print("------------------------");

       if (media > 7.0) {
        System.out.println(" Aluno aprovado ");

        
       }
       else System.out.println("Aluno Reprovado ");

       
      

       scan.close();


    }
    
}
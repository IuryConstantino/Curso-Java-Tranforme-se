package Atividade.sequencias;

import java.util.Scanner;



public class Atividade5 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Digite a primeira nota: ");
       double nota1 =scan.nextDouble();
       System.out.print("Digite a segunda nota: ");
       double nota2 =scan.nextDouble();
     
       double media = (nota1 +nota2) /2;

       System.out.println("Média: " +media);
       System.out.print("------------------------");
      

       scan.close();


    }
    
}
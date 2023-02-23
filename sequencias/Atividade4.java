package Atividade.sequencias;

import java.util.Scanner;



public class Atividade4 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Digite um valor: ");
       int num1 =scan.nextInt();

       System.out.print("Digite outro valor: ");
       int num2 = scan.nextInt();
     
       int soma = num1 + num2;
       System.out.print("Soma: "  +soma);
       System.out.print("\n------------------------\n");
       System.out.print("Soma: " + (num1 + num2)); 

       scan.close();


    }
    
}
package Atividade.sequencias;

import java.util.Scanner;

/* Tempo da Video Aula 1: 33 */

public class Atividade6 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
      System.out.println("Digite um valor: ");
      int num1 =scan.nextInt();

      System.out.println("--------------------------------------");
      System.out.println(" Antecessor: "+ (num1-1) + " Seu número " +num1+ " Sucessor: " + (num1 +1) );
       scan.close();


    }
    
}
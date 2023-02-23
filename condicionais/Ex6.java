package Atividade.condicionais;

import java.util.Scanner;



public class Ex6 {
    
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Digite seu sexo (M/F): ");
        char sexo = scan.next().charAt(0);

        System.out.print("Digite o valor das compras: ");
        double valorCompras = scan.nextDouble();

        double desconto = 0.0;

        if (sexo == 'F'||sexo == 'f') {
            System.out.println(nome+", parabéns pelo seu dia!!!!!");
            desconto = valorCompras * 13/100;
        } else {
            System.out.print(nome);
            desconto = valorCompras * 5/100;
        }

        double valorFinal = valorCompras - desconto;

        System.out.println(" você pagará: R$" + valorFinal);

        scan.close();
    }
}
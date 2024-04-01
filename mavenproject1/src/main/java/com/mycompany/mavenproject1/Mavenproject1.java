package com.mycompany.mavenproject1;
import java.util.Scanner;
        
public class Mavenproject1 {
    
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n1 = scan.nextInt();
        System.out.print("Digite outro: ");
        n2 = scan.nextInt();
        int soma = n1+n2;
        System.out.println(n1+" + "+n2+" = "+soma);
        
        condicao(soma);
    }
    public static void condicao(int soma){
        if (soma<0){
            System.out.println("--Valores negativos!--");
        }
        else{System.out.println("--Operação concluída--");}
    }
}

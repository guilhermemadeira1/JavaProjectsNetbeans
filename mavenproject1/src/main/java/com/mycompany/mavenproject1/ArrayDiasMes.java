/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

public class ArrayDiasMes {
    public static void main(String[]args){
        System.out.print("O número de dias de cada mês do ano é: ");
        diaMes();
    }
    static void diaMes(){
        int i;
        int[]dias =  {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(i=0; i<12;i++){
            System.out.println("O mês "+(i+1)+"possui"+dias[i]+"dias");
        }
    }
}

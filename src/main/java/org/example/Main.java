package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int user;
        System.out.printf("insirar 5 números: ");
        user = input.nextInt();

//        System.out.printf("%d",user);

//        convertendo o número inteiro para uma string
        String userString = Integer.toString(user);

//        criar um for para itera/repete os caracteres da string e imprime cada um com espaço
        for (int i = 0; i < userString.length(); i++) {
//            Imprime o caractere atual seguido de um espaço
            System.out.print(userString.charAt(i) + "   ");
        }

        //Número com mais de cinco dígitos:
        //Número com menos de cinco dígitos:

        System.out.println();

        input.close();
    }
}






package Aprendendo.Java.main.src.flamingo.aprendendo.basico.exercicioarreys;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++){
            System.out.printf("digite o %d ", i + 1);
            numeros[i] = sc.nextInt();

            soma += numeros[i];
        }
        System.out.println("soma total: " + soma);

        sc.close();
    }
}

package Aprendendo.Java.main.src.flamingo.aprendendo.basico.exercicioarreys;

import java.util.Scanner;

public class ex05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++){
            System.out.printf("digite o %d : ", + 1);
            numeros[i] = sc.nextInt();
        }

        int maior = numeros[0];

        for (int i = 1; i< numeros.length; i ++){
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("maior numero : " + maior);
        sc.close();
    }
}

package Aprendendo.Java.main.src.flamingo.aprendendo.basico.exercicioarreys;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];
        double media,soma = 0;

        for (int i = 0; i < notas.length; i++){
            System.out.printf("digite a %d nota: ", i + 1);
            notas[i] = sc.nextDouble();

            soma += notas[i];
        }
        media = soma / notas.length;
        System.out.printf("%.2f / %f = %.2f", soma, notas.length, media );

        sc.close();
    }
}

package Aprendendo.Java.main.src.flamingo.aprendendo.basico.exercicioarreys;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // \n quebra linha
        int[] idades = new int[6];

        for (int i = 0; i <idades.length; i++){
            System.out.printf("digite o %d idade: \n", i + 1);
            idades[1] = sc.nextInt();
        }

        for (int idade : idades){
            System.out.println(idade + "anos");
        }

        sc.close();
    }
}

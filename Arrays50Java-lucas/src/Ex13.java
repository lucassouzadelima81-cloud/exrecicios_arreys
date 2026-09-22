import java.util.Scanner;

public class Ex13 {
    static void main(String[] args) {
        int[] numeros = new int[10];
        int numeroPesquisado;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        numeroPesquisado = sc.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            if (numeroPesquisado == numeros[i]) {
                contador++;
            }
        }
        System.out.println(" o numero aparece " +contador+ " vezes ");

    }
}



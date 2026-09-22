import java.util.Scanner;

public class Ex10 {
    static void main(String[] args) {
        double[] notas = new double[5];
        double soma = 0;
        double media;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        media = soma / notas.length;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println(notas[i]);
            }

        }

    }
}

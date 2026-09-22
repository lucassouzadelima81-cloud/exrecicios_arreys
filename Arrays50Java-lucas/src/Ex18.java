import java.util.Scanner;

public class Ex18 {
    static void main(String[] args) {
        double[] notas = new double[6];
        double soma = 0;
        double maior = notas[0];
        double menor = notas[0];
        double media;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        maior = notas[0];
        menor = notas[0];
        media = soma / notas.length;

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Média da turma: " + media);
    }
}

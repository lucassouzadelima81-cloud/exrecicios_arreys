import java.util.Scanner;
public class Ex38 {
    static void main(String[] args) {
        String[] nomes = new String[4];
        double[][] notas = new double[4][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = sc.nextLine();

            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = sc.nextDouble();
            }

            sc.nextLine();
        }

        for (int i = 0; i < nomes.length; i++) {
            double soma = 0;

            System.out.print(nomes[i] + " - Notas: ");

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
                soma += notas[i][j];
            }

            double media = soma / notas[i].length;

            System.out.print("- Média: " + media);

            if (media >= 7) {
                System.out.println(" - Aprovado");
            } else {
                System.out.println(" - Reprovado");
            }
        }
    }
}

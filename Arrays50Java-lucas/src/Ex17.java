import java.util.Scanner;

public class Ex17 {
    static void main(String[] args) {
        double[] notas = new double[8];
        int aprovados = 0;
        int reprovados = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextDouble();
            if (notas[i] >= 7) {
                aprovados++;
            } else {
                reprovados++;
            }
        }
        System.out.println("Quantidade de aprovados: " + aprovados);
        System.out.println("Quantidade de reprovados: " + reprovados);
    }
}



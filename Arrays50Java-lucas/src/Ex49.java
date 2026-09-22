import java.util.Scanner;
public class Ex49 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] vendas = new double[3][4];
        for (int i = 0; i < 3; i++) {
            System.out.println("Vendedor " + (i + 1));

            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor da venda " + (j + 1) + ": ");
                vendas[i][j] = sc.nextDouble();
            }
        }

        double maiorTotal = 0;
        int vendedorMaior = 0;
        for (int i = 0; i < 3; i++) {

            double total = 0;

            for (int j = 0; j < 4; j++) {
                total = total + vendas[i][j];
            }

            System.out.printf("Vendedor %d vendeu R$ %.2f%n", i + 1, total);
            if (total > maiorTotal) {
                maiorTotal = total;
                vendedorMaior = i + 1;
            }
        }

        System.out.printf("O vendedor que vendeu mais foi o vendedor %d, com R$ %.2f%n",
                vendedorMaior, maiorTotal);
    }
}

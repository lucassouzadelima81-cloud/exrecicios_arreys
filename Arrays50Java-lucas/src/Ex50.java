import java.util.Scanner;
public class Ex50 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] estoque = new int[3][5];
        for (int i = 0; i < 3; i++) {
            System.out.println("Loja " + (i + 1));

            for (int j = 0; j < 5; j++) {
                System.out.print("Digite a quantidade do produto " + (j + 1) + ": ");
                estoque[i][j] = sc.nextInt();
            }
        }
        int maiorTotal = 0;
        int lojaMaior = 0;

        System.out.println("\nTotal de produtos por loja:");

        for (int i = 0; i < 3; i++) {

            int totalLoja = 0;

            for (int j = 0; j < 5; j++) {
                totalLoja = totalLoja + estoque[i][j];
            }

            System.out.println("Loja " + (i + 1) + ": " + totalLoja + " produtos");
            if (totalLoja > maiorTotal) {
                maiorTotal = totalLoja;
                lojaMaior = i + 1;
            }
        }
        System.out.println("\nTotal de cada produto:");

        for (int j = 0; j < 5; j++) {

            int totalProduto = 0;

            for (int i = 0; i < 3; i++) {
                totalProduto = totalProduto + estoque[i][j];
            }

            System.out.println("Produto " + (j + 1) + ": " + totalProduto);
        }
        System.out.println("\nA loja com mais produtos no estoque é a Loja "
                + lojaMaior + ", com " + maiorTotal + " produtos.");

    }
}

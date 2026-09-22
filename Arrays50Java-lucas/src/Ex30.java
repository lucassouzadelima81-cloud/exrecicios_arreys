import java.util.Scanner;

public class Ex30 {
    static void main(String[] args) {
        int[] quantidades = new int[5];
        String[] produtos = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < quantidades.length; i++) {
            produtos[i] = sc.nextLine();
            quantidades[i] = sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i < produtos.length; i++) {
            if (quantidades[i] < 5) {
                System.out.println(produtos[i] + " - " + quantidades[i]);
            }

        }
    }
}
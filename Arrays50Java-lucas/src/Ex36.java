import java.util.Scanner;
public class Ex36 {
    static void main(String[] args) {
        int[][] matriz = new int[3][4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < matriz[0].length; j++) {
            int somaColuna = 0;

            for (int i = 0; i < matriz.length; i++) {
                somaColuna += matriz[i][j];
            }

            System.out.println("Soma da coluna " + (j + 1) + ": " + somaColuna);
        }
    }
}

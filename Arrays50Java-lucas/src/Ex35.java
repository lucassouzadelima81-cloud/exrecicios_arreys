import java.util.Scanner;
public class Ex35 {
    static void main(String[] args) {
        int[][] matriz = new int[3][4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                somaLinha += matriz[i][j];
            }

            System.out.println("Soma da linha " + (i + 1) + ": " + somaLinha);
        }
    }
}

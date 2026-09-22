import java.util.Scanner;
public class Ex40 {
    static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int soma = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();

                if (i == j) {
                    soma += matriz[i][j];
                }
            }
        }

        System.out.println("Soma da diagonal principal: " + soma);
    }
    }


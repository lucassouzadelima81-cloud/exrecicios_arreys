import java.util.Scanner;
public class Ex44 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        boolean encontrado = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.print("Digite o número que deseja pesquisar: ");
        int numero = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matriz[i][j] == numero) {
                    System.out.println("Número encontrado na linha " + i + " e coluna " + j);
                    encontrado = true;
                }
            }
        }

        if (encontrado == false) {
            System.out.println("Número não encontrado.");
        }

    }
}

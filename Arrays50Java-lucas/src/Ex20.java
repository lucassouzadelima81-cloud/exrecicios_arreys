import java.util.Scanner;

public class Ex20 {
    static void main(String[] args) {
        int[] numeros = new int[6];
        boolean repetido = false;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {

            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    repetido = true;
                }

            }
        }
            if (repetido) {
                System.out.println("Existe número repetido.");
            } else {
                System.out.println("Não existe número repetido.");
            }
        }


    }



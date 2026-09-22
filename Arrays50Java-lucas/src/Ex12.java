import java.util.Scanner;

public class Ex12 {
    static void main(String[] args) {
        int[] numeros = new int[8];
        int numeroPesquisado;
        boolean encontrado = false;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        numeroPesquisado = sc.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            if (numeroPesquisado == numeros[i]) {
                encontrado = true;
                System.out.println(" numero encontrado na posição " + i);
            }
        }

        if (encontrado) {
            System.out.println("numero encontrado");
        } else {
            System.out.println("numero nao encontrado");
        }
    }
}



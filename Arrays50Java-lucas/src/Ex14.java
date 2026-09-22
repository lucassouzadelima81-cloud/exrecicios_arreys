import java.util.Scanner;

public class Ex14 {
    static void main(String[] args) {
        int[] numeros = new int[6];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        System.out.println("Valores na ordem inversa:");
        for (int i = 5; i >=0; i--) {
            System.out.println(numeros[i]);
        }

    }
}



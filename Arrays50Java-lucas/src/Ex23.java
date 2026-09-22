import java.util.Scanner;

public class Ex23 {
    static void main(String[] args) {
        int[] numeros = new int[5];
        int multiplicador;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        multiplicador = sc.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " x " + multiplicador + " = " + numeros[i] * multiplicador);
        }
    }
}

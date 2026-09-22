import java.util.Scanner;

public class Ex15 {
    static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(" o dobro do numero é "+numeros[i]*2);
            }
        }
    }


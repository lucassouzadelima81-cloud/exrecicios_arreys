import java.util.Scanner;

public class Ex19 {
    static void main(String[] args) {
        int[] numeros = new int[5];
        int temporario;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        temporario = numeros[0];
        numeros[0] = numeros[4];
        numeros[4] = temporario;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        }
    }



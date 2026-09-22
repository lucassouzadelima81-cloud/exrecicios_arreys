import java.util.Scanner;

public class Ex16 {
    static void main(String[] args) {
        int[] numeros = new int[5];
        int[] dobros = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            dobros[i] = numeros[i] * 2;
        }for (int i = 0; i < numeros.length; i++){
            System.out.println(dobros[i]);
        }
    }
}



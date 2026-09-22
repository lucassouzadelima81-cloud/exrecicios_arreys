import java.util.Scanner;

public class Ex09 {
    static void main(String[] args) {
        int[] numero = new int[10];
        int postivos = 0;
        int negativos = 0;
        int zeros = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numero.length; i++) {
            numero[i] = sc.nextInt();
            if (numero[i] > 0) {
                postivos++;
            } else if (numero[i] < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }
        System.out.println("Positivos: " + postivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);
    }
}

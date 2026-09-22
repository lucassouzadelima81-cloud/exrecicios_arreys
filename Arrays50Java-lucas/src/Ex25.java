import java.util.Scanner;

public class Ex25 {
    static void main(String[] args) {
        int[] numero = new int[10];
        int conta = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numero.length; i++) {
            numero[i] = sc.nextInt();
        }
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 != 0)
                conta += numero[i];
        }
        System.out.println(conta);
    }
    }


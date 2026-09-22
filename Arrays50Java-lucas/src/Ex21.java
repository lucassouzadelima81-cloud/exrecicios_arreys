import java.util.Scanner;

public class Ex21 {
    static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] soma = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }
        for (int i = 0; i < soma.length; i++) {
            soma[i] = array1[i] + array2[i];
        }
        for (int i = 0; i < soma.length; i++) {
            System.out.println(soma[i]);
        }
    }
}




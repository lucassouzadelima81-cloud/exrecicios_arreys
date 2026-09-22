import java.util.Scanner;

public class Ex06 {
    static void main(String[] args) {
        int[] numeros = new int[6];
        int menor;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i]<menor){
                menor=numeros[i];
            }
        }
        System.out.println(menor);
    }
}

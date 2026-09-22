import java.util.Scanner;

public class Ex03 {
    static void main(String[] args) {
        int[] numeros = new int[5];
        int soma=0;
        Scanner sc=new Scanner(System.in);
        for (int i=0;i< numeros.length;i++){
            numeros[i]= sc.nextInt();
        }
        for (int i=0;i< numeros.length;i++){
            soma+=numeros[i];
            System.out.println(soma);
        }
    }
}

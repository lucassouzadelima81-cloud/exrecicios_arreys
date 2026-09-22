import java.util.Scanner;

public class Ex02 {
    static void main(String[] args) {
        int[]idades=new int[6];
        Scanner sc=new Scanner(System.in);
        for (int i=0; i< idades.length;i++){
            idades[i]= sc.nextInt();
        }
        for (int i=0;i< idades.length;i++){
            System.out.println(idades[i]);
        }
    }
}

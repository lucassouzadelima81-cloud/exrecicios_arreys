import java.util.Scanner;

public class Ex04 {
    static void main(String[] args) {
        double []notas=new double[4];
        Scanner sc=new Scanner(System.in);
        double soma=0;
        double media;
        for (int i=0;i< notas.length;i++){
            notas[i]= sc.nextDouble();
        }
        for (int i=0;i< notas.length;i++){
              soma+=notas[i];

        }
        media=soma/ notas.length;
        System.out.println(media);
    }
}

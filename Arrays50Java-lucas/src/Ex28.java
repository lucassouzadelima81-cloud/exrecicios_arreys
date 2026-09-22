import java.util.Scanner;

public class Ex28 {
    static void main(String[] args) {
        double[] notas = new double[5];
        String[] nomes = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            nomes[i] = sc.nextLine();
            notas[i] = sc.nextDouble();
            sc.nextLine();
        }
        for (int i = 0; i < nomes.length; i++) {
            if (notas[i] >= 7){
                System.out.println(nomes[i] + " - " + notas[i] + " - Aprovado");
            }else {
                System.out.println(nomes[i] + " - " + notas[i] + " - Reprovado");
            }
        }

    }
}



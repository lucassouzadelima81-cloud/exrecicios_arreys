import java.util.Scanner;

public class Ex27 {
    static void main(String[] args) {
        String[] nomes = new String[6];
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = sc.nextLine();
        }

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].charAt(0) == 'A') {
                contador++;
            }
        }
        System.out.println(contador);
    }
}

import java.util.Scanner;

public class Ex26 {
    static void main(String[] args) {
        String[] nomes = new String[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = sc.nextLine();
        }

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].length() > 5) {
                System.out.println(nomes[i]);
            }
        }
    }
}

import java.util.Scanner;

public class Ex11 {
    static void main(String[] args) {
        String[] nomes = new String[5];
        String nomePesquisado;
        boolean encontrado = false;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = sc.nextLine();
        }
        nomePesquisado = sc.nextLine();
        for (int i = 0; i < nomes.length; i++) {
            if (nomePesquisado.equals(nomes[i])) {
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("nome encontrado");
        } else {
            System.out.println("nome nao encontrado");
        }
    }
}


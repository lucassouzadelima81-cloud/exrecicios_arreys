import java.util.Scanner;

public class Ex29 {
    static void main(String[] args) {
        int opcao;
        String[] produtos = new String[5];
        String produtoPesquisado;
        boolean encontrado = false;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < produtos.length; i++) {
            produtos[i] = sc.nextLine();
        }

        opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                for (int i = 0; i < produtos.length; i++) {
                    System.out.println(produtos[i]);
                }
                break;

            case 2:
                produtoPesquisado = sc.nextLine();

                for (int i = 0; i < produtos.length; i++) {
                    if (produtoPesquisado.equals(produtos[i])) {
                        encontrado = true;
                    }
                }

                if (encontrado) {
                    System.out.println("Produto encontrado");
                } else {
                    System.out.println("Produto não encontrado");
                }
                break;

            case 3:
                System.out.println("Quantidade de produtos: " + produtos.length);
                break;

            default:
                System.out.println("Opção inválida");
        }
    }
}



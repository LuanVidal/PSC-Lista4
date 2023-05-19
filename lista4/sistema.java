package lista4;

import java.util.Scanner;

public class sistema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Produto produto1 = new Produto("Feijão", 1, 10.00);
        Produto produto2 = new Produto("Arroz", 2, 15.00);
        Produto produto3 = new Produto("Pão", 3, 7.50);


        fatura faturas = new fatura();
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n|  MENU  |");
            System.out.println("\n1 - Comprar");
            System.out.println("2 - Ver Fatura");
            System.out.println("3 - Encerrar Programa");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

                     System.out.println("\n | Produtos disponíveis |");
                        System.out.println("\nCódigo\tNome\tPreço");
                        
                        System.out.println(produto1.getCodigo() + "\t" + produto1.getNome() + "\t" + produto1.getPreco());
                        System.out.println(produto2.getCodigo() + "\t" + produto2.getNome() + "\t" + produto2.getPreco());
                        System.out.println(produto3.getCodigo() + "\t" + produto3.getNome() + "\t" + produto3.getPreco());
    
                        System.out.print("\nDigite o código do produto: ");
                        int codigo = scanner.nextInt();
                        System.out.print("Digite a quantidade comprada: ");
                        int quantidade = scanner.nextInt();
    
                        Produto produto = null;
                        if (codigo == produto1.getCodigo()) {
                            produto = produto1;
                        } else if (codigo == produto2.getCodigo()) {
                            produto = produto2;
                        } else if (codigo == produto3.getCodigo()) {
                            produto = produto3;
                        }
    
                        if (produto != null) {
                            item item = new item(produto, quantidade);
                            faturas.adicionarItem(item);
                            System.out.println("\nItem adicionado à fatura.");
                        } else {
                            System.out.println("Código de produto inválido.");
                        }
    
                    break;
                
                case 2:
                    System.out.println("\n| Fatura |");
                    System.out.println("\nCódigo\tNome\t\tQuantidade\tPreço\tValor Total");
                    for (item itens : faturas.getItens()) {
                        Produto prod = itens.getProduto();
                        System.out.println(prod.getCodigo() + "\t" + prod.getNome() + "\t\t" + itens.getQuantidade() + "\t\t" + prod.getPreco() + "\t" + itens.getValorTotal());
                    }
                    System.out.println("\nTOTAL DA COMPRA: " + faturas.getValorTotalFatura());

                break;

                case 3:
                    System.out.println("\nPrograma encerrando");

                break;    

                default:
                    System.out.println("Opção inválida");

                break;
            } 
        }

        scanner.close();
    }
}

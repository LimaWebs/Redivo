import java.util.ArrayList;

public class Main {
    
    private static ArrayList<Item> lista = new ArrayList<>();

    public static void main(String[] args) {
        int opcao = -1;

        
        while (opcao != 0) {
            System.out.println("\n--- SISTEMA DE CADASTRO ---");
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar");
            System.out.println("0. Sair");
            
            
            opcao = EntradaDados.lerInteiro("Opcao: ");

            switch (opcao) {
                case 1:
                    
                    String nome = EntradaDados.lerString("Nome: ");
                    double preco = EntradaDados.lerDouble("Preco: ");
                    lista.add(new Item(nome, preco));
                    System.out.println("Sucesso: Item adicionado.");
                    break;

                case 2:
                    System.out.println("\n--- LISTAGEM ---");
                    
                    if (lista.isEmpty()) {
                        System.out.println("Nao existem itens cadastrados.");
                    } else {
                        
                        for (Item i : lista) {
                            System.out.println(i);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }
}
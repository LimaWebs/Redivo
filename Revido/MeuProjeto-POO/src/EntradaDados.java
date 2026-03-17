import java.util.Scanner;
import java.util.InputMismatchException;

public class EntradaDados {
    
    private static Scanner scanner = new Scanner(System.in);

   
    public static int lerInteiro(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                int valor = scanner.nextInt();
                scanner.nextLine(); 
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas numeros inteiros.");
                scanner.nextLine(); 
            }
        }
    }

   
    public static double lerDouble(String mensagem) {
        while (true) {
            try {
                System.out.print(mensagem);
                double valor = scanner.nextDouble();
                scanner.nextLine(); 
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Formato de numero incorreto.");
                scanner.nextLine();
            }
        }
    }

  
    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }
}
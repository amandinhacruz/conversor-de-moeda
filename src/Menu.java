import java.util.Scanner;

public class Menu {
    public void exibir() {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("***************Casa Das Moedas****************");
            System.out.println("  Por favor escolha uma opção abaixo          ");
            System.out.println("(1) - USD (Dólar) para ARS (Peso Argentino)   ");
            System.out.println("(2) - ARS (Peso Argentino) para USD (Dólar)   ");
            System.out.println("(3) - USD (Dólar) para BRL (real Brasileiro)  ");
            System.out.println("(4) - BRL (real Brasileiro) para USD (Dólar)  ");
            System.out.println("(5) - USD (Dólar) para COP (Peso Colombiano)  ");
            System.out.println("(6) - COP (Peso Colombiano) para USD (Dólar)  ");
            System.out.println("(7) - Digitar moeda de origem, destino e valor");
            System.out.println("(8) - Sair ");
            System.out.println("**********************************************");

            System.out.print("Escolha uma opção válida: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    Conversor.ConversorMoeda("USD", "ARS", scanner);
                    break;
                case 2:
                    Conversor.ConversorMoeda("ARS", "USD", scanner);
                    break;
                case 3:
                    Conversor.ConversorMoeda("USD", "BRL", scanner);
                    break;
                case 4:
                    Conversor.ConversorMoeda("BRL", "USD", scanner);
                    break;
                case 5:
                    Conversor.ConversorMoeda("USD", "COP", scanner);
                    break;
                case 6:
                    Conversor.ConversorMoeda("COP", "USD", scanner);
                    break;
                case 7:
                    Moeda.escrever(scanner);
                    break;
                case 8:
                    System.out.println("Fechando o aplicativo");
                    break;
                default:
                    System.out.println("*********************************** --ERRO-- ***********************************");
                    System.out.println("Opção inválida.");
                    System.out.println("***********************************");
                    System.out.println("Enter para voltar ao menu principal");
                    scanner.nextLine();
            }
        } while (escolha != 8);
        scanner.close();
        System.exit(1);
    }
}

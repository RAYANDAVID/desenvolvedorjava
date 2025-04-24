import java.io.FileWriter;//Classe para escrever no arquivo
import java.io.IOException;//Classe para tratar exceções no arquivo
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // declaração de variáveis
        String nome;
        int opcaoTransporte;
        String meioTransporte = "";

        //classe para recebimento de dados
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("-------Pesquisa de Transporte Diário-------");
        System.out.println("Digite seu nome");
        nome = scanner.nextLine();
        System.out.println("Seu nome é: " + nome); 
        
        System.out.println("Como você vai ao trabalho?");
        System.out.println("1-Metro");
        System.out.println("2-Onibus");
        System.out.println("3-Caminhada");
        System.out.println("4-Uber");
        System.out.println("5-Táxi");
        System.out.println("6-Carro");
        System.out.println("Escolha uma opção (1-6)");
        opcaoTransporte = scanner.nextInt();

        switch (opcaoTransporte) {
            case 1:
                    meioTransporte = "Metro";
                break;
                
            case 2:
                    meioTransporte = "Onibus";
                break;
                
            case 3:
                    meioTransporte = "Caminhada";
                break;
        
            case 4:
                    meioTransporte = "Uber";
                break;
        
            case 5:
                    meioTransporte = "Taxi";
                break;
                
            case 6:
                    meioTransporte = "Carro";
                break;
        
            default:
                break;
        }

        System.out.println("Nome: "+nome+","+" Meio de Transporte: "+meioTransporte); 
    }
}

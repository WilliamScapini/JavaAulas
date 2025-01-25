import java.util.Scanner;
public class scaner {

    public static void main(String[] args) {
        String numero;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        numero = leitor.nextLine();
        System.out.printf("O número digitado foi %s",numero);
        leitor.close();
    }
}

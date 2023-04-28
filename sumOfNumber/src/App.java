import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int n1, n2;
        
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite Um Numero: ");
            n1 = sc.nextInt();
            System.out.print("\nDigite Outro Numero: ");
            n2 = sc.nextInt();
            System.out.printf("%nA soma de: %d + %d = %d%n",  n1, n2, n1+ n2);
            
            sc.close();
    }
}

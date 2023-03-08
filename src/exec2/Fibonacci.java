package exec2;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;
        boolean pertence = false;
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            
            System.out.print("Sequência de Fibonacci: " + n1 + " " + n2);
            
            for (int i = 2; i <= num; i++) {
                n3 = n1 + n2;
                System.out.print(" " + n3);
                if (n3 == num) {
                    pertence = true;
                }
                n1 = n2;
                n2 = n3;
            }
            
            if (pertence) {
                System.out.println("\nO número " + num + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("\nO número " + num + " não pertence à sequência de Fibonacci.");
            }
        }
    }
}

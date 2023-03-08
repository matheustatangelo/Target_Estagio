package exec5;

import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Digite uma string: ");
            String stringOriginal = scanner.nextLine();

            char[] caracteres = stringOriginal.toCharArray();

            // Inverte os caracteres do array
            for (int i = 0; i < caracteres.length / 2; i++) {
                char temp = caracteres[i];
                caracteres[i] = caracteres[caracteres.length - i - 1];
                caracteres[caracteres.length - i - 1] = temp;
            }

            String stringInvertida = new String(caracteres);

            System.out.println("String invertida: " + stringInvertida);
        }
    }
}

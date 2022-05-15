package equacao2grau;
import java.util.Scanner;

public class Equacao2Grau {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double A, B, C, valorDelta, x1, x2;
        System.out.println("Informe o valor do coeficiente A: ");
        A = input.nextDouble();
        System.out.println("Informe o valor do coeficiente B: ");
        B = input.nextDouble();
        System.out.println("Informe o valor do coeficiente C: ");
        C = input.nextDouble();
        valorDelta = Math.pow(B, 2) - 4 * A * C;
        System.out.println("Delta tem o valor de: " + valorDelta );
        if (valorDelta < 0){
            System.out.println("Não existe raiz real. ");
        }
        else if (valorDelta == 0){
            x1 = x2 = -B / (2 * A);
            System.out.printf("O valor das raízes é: \n x1: %.2f \n e x2: %.2f \n", x1, x2);
        }
        else {
            x1 = (- B + Math.sqrt(valorDelta)) / (2 * A);
            x2 = (- B - Math.sqrt(valorDelta)) / (2 * A);
            System.out.printf("O valor das raízes é: \n x1: %.2f \n e x2: %.2f \n", x1, x2);
        }
    }
}

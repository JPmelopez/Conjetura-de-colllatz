package conjeturacollatz;
import java.util.Scanner;

public class ConjeturaCollatz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int n = input.nextInt();
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        System.out.print(n);
    }
    
}

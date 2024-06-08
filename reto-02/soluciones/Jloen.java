import java.io.IOException;
import java.util.Scanner;

public class Jloen {

    public static void main(String[] args) throws IOException {
        int numero1 = 0, numero2 = 0, suma = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        numero1 = input.nextInt();
        System.out.print("Introduce el segundo numero: ");
        numero2 = input.nextInt();

        suma = numero1 + numero2;
        System.out.println("El resultado de la suma es: " + suma);

    }


}
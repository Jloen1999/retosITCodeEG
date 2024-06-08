import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jloen {

    public static void main(String[] args) throws IOException {
        String frase = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce una frase: ");
        frase = br.readLine();

        // Contar todas las palabras que contiene la frase
        int palabras = contarPalabras(frase);
        System.out.println("La frase tiene " + palabras + " palabras");


    }

    private static int contarPalabras(String frase) {
        int palabras = 0;
        // Eliminar los espacios en blanco al inicio y al final de la frase
        frase = frase.trim();
        // Eliminar los espacios en blanco duplicados
        frase = frase.replaceAll("\\s+", " ");
        // Convertir la frase en un arreglo de palabras
        String[] arregloPalabras = frase.split(" ");

        return arregloPalabras.length;
    }
}
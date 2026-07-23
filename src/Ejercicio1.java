import java.util.Random;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Ejercicio1 {
   public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // 1. Solicitamos un número al usuario en tiempo de ejecución
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        // 2. Creamos el array con el tamaño que ingresó el usuario
        int[] miArray = new int[numero];

        // 3. Llenamos el array con números aleatorios entre 1 y 100
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = random.nextInt(100) + 1; 
        }
        Array.sort(numero);
        System.out.print(numero);
        scanner.close();
    } 

    public class OrdenarNumeros {
        public static void main(String[] args) {
            Random random = new Random();
            int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        Arrays.sort(numeros);
        int numeroMenor = numeros[0];
        int numeroMayor = numeros[numeros.length - 1];

        System.out.println("Lista ordenada: " + Arrays.toString(numeros));
        System.out.println("Número menor: " + numeroMenor);
        System.out.println("Número mayor: " + numeroMayor);
    }
}
}       
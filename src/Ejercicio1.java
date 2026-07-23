import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 1. Solicitamos el tamaño del array al usuario
        System.out.print("Ingresa el tamaño del arreglo: ");
        int numero = scanner.nextInt();

        // 2. Creamos el array
        int[] array = new int[numero];

        // 3. Llenamos el array con números aleatorios entre 1 y 100
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1; 
        }

        scanner.close();

        // 4. Ordenamos el array de menor a mayor
        Arrays.sort(array);

        // 5. Obtenemos el menor (primer elemento) y el mayor (último elemento)
        int numeroMenor = array[0];
        int numeroMayor = array[array.length - 1];

        // 6. Mostramos los resultados
        System.out.println("Lista ordenada: " + Arrays.toString(array));
        System.out.println("Número menor: " + numeroMenor);
        System.out.println("Número mayor: " + numeroMayor);
    }
}
    
       
            
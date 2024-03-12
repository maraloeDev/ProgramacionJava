package EjerciciosArrays;




public class Ejercicio03_Datos2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int count = 0;
        int sum = 0;
        System.out.println("Elementos pares en posiciones impares:");
        for (int i = 1; i < array.length; i += 2) {
            if (array[i] % 2 == 0) {
                count++;
                sum += array[i];
                System.out.println("Elemento: " + array[i] + ", Posicion: " + i);
            }
        }
        System.out.println("Cantidad de elementos pares en posiciones impares: " + count);
        System.out.println("Suma de los elementos pares en posiciones impares: " + sum);
    }
    }
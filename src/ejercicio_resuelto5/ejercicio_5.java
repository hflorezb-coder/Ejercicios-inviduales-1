package ejercicio_resuelto5;
import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        double suma, x, y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número para suma:");
        suma = scanner.nextDouble();

        System.out.println("Ingresa un número para x:");
        x = scanner.nextDouble();

        System.out.println("Ingresa un número para y:");
        y = scanner.nextDouble();

        x = Calculos.calcular_x(x, y);
        suma = Calculos.calcular_suma(suma, x);

        System.out.println("El valor de la suma es: " + suma);

        scanner.close();
    }
}
package ejercicio_resuelto14;

import java.util.Scanner;

public class ejercicio14  {
    public static void main(String[] args) {
        double numero, cuadrado, cubo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa un numero");
        numero = scanner.nextDouble();
        cuadrado = Calculos.calcular_cuadrado(numero);
        cubo = Calculos.calcular_cubo(numero);

        System.out.println("numero: " + numero);
        System.out.println("cuadrado: " + cuadrado);
        System.out.println("cubo: " + cubo);

    }
}

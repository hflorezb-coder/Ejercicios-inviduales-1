package ejercicio_resuelto17;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        double radio, longitud_circunferencia, area_circulo;

        Scanner scanner = new Scanner(System.in); //lectura de la entrada del teclado

        System.out.println("Ingresa un número para el radio:");
        radio = scanner.nextDouble();

        longitud_circunferencia = Calculos.calcular_longitud_circunferencia(radio);
        area_circulo = Calculos.calcular_area_circulo(radio);

        System.out.println("longitud de la circunferencia: " + longitud_circunferencia);
        System.out.println("Area del circulo: " + area_circulo);
    }
}

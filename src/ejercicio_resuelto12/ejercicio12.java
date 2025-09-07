package ejercicio_resuelto12;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        double horas_trabajadas, valor_hora, retencion, salario_bruto, salario_neto;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número para las horas trabajadas:");
        horas_trabajadas = scanner.nextDouble();

        System.out.println("Ingresa un número para el valor por hora:");
        valor_hora = scanner.nextDouble();

        System.out.println("Ingresa un número para la retención (%):");
        retencion = scanner.nextDouble();

        salario_bruto = Calculos.calcular_salario_bruto(horas_trabajadas, valor_hora);
        double porcentaje = Calculos.calcular_porcentaje_retencion(retencion);
        double valor_retencion_fuente = Calculos.calcular_valor_retencion_fuente(porcentaje, salario_bruto);
        salario_neto = Calculos.calcular_salario_neto(salario_bruto, valor_retencion_fuente);

        System.out.println("Salario Bruto: " + salario_bruto);
        System.out.println("Valor retención en la fuente: " + valor_retencion_fuente);
        System.out.println("Salario Neto: " + salario_neto);

        scanner.close();
    }
}

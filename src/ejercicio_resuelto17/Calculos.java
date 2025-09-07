package ejercicio_resuelto17;

public class Calculos {
    static double calcular_longitud_circunferencia(double radio) {
        double longitud_circunferencia = 2 * Math.PI * radio;
        return longitud_circunferencia;
    }

    static double calcular_area_circulo(double radio) {
        double area_circulo = Math.PI * Math.pow(radio, 2);
        return area_circulo;
    }
}

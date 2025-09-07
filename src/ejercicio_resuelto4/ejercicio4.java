package ejercicio_resuelto4;

public class ejercicio4 {

    public static void main(String[] args) {
        double edjuan = 9;
        double edalber = Calculos.calcular_edalber(edjuan);
        double edana = Calculos.calcular_edana(edjuan);
        double edmama = Calculos.calcular_edmama(edjuan, edalber, edana);

        System.out.println("Juan: " + edjuan);
        System.out.println("Ana: " + edana);
        System.out.println("Alberto: " + edalber);
        System.out.println("Mama: " + edmama);
    }
}


package Taller_2_Package;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de personas que se han apuntado: ");
        int numPersonas = scanner.nextInt();

        int numAutobuses = numPersonas / 45;
        int personasEnFurgonetas = numPersonas % 45;

        if (personasEnFurgonetas > 0) {
            numAutobuses++;
        }

        System.out.println("Número de autobuses necesarios: " + numAutobuses);
        System.out.println("Número de personas en furgonetas: " + personasEnFurgonetas);
    }
}


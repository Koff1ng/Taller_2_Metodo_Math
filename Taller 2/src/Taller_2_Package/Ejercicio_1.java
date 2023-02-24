package Taller_2_Package;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingresa la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingresa la altura del triángulo: ");
        double altura = scanner.nextDouble();

       
        double superficie = (base * altura) / 2;
        superficie = Math.round(superficie * 100) / 100.0; 

        
        System.out.println("La superficie del triángulo es: " + superficie);
    }
}

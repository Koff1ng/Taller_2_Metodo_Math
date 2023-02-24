package Taller_2_Package;
import java.util.Scanner;
public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		    // PUNTO A
		    System.out.println("Ingrese el valor de X para punto A: ");
		    int x = sc.nextInt();
			double a =  Math.sqrt(Math.pow(x, 5)-6)/4;	
            System.out.println("El valor de la formula A es: "+ Math.round(a) );
            
            //PUNTO B
            System.out.println("Ingrese valor de X para punto B: ");
            int X2 = sc.nextInt();
            System.out.println("Ingrese valor de Y para punto B: ");
            int Y2 = sc.nextInt();
            double b =  Math.pow(X2,Y2)- Math.pow(6,X2);
            
            System.out.println("El valor de la formula B del taller 2 es: "+ Math.round(a));
            
            //PUNTO C 
            System.out.println("Ingrese el valor de Z para el punto c: ");
            int z = sc.nextInt();
            System.out.println("Ingrese el valor de X para el punto c: ");
            int X3 = sc.nextInt();
            double c = 4* Math.cos(z/5)- Math.sin(Math.pow(X3, 2));
            
            System.out.println("El valor de la formula C del taller 2 es: "+ Math.round(c));
            
            //PUNTO D
            System.out.println("Ingrese valor de X para punto D: ");
            int X4 = sc.nextInt();
            System.out.println("Ingrese valor de Y para punto D: ");
            int Y4 = sc.nextInt();
            double d = Math.pow(X4, 4)- Math.sqrt(6*X4-Math.pow(Y4, 3));
            System.out.println("El valor de la formula D del taller 2 es: "+ Math.round(d));
            
            //PUNTO E
            System.out.println("Ingrese valor de X para punto E: ");
            int X5 = sc.nextInt();
            System.out.println("Ingrese valor de Y para punto E: ");
            int Y5 = sc.nextInt();
            double e = 1/Y5-(1/X5-Math.pow(2, Y5));
            
            System.out.println("El valor de la formula E del taller 2 es: "+ Math.round(e));
            
            //PUNTO F
            System.out.println("Ingrese el valor de X para punto F: ");
		    int X6 = sc.nextInt();
			double f = 7* Math.cos(Math.sqrt(5-Math.sin(Math.sqrt(3*X6-4)))) ;	
			
            System.out.println("El valor de la formula F del taller 2 es: "+ Math.round(f) );
            
            
            
          
	}
}

	

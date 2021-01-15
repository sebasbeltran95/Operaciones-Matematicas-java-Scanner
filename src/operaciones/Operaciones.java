package operaciones;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero1 = 2;
        int numero2 = 8;
        int resultado = 0;
        int operacion = 0;
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Porfavor Ingrese primer valor ");
        numero1 = Entrada.nextInt();
        
        System.out.println("Porfavor Ingrese segundo valor ");
        numero2 = Entrada.nextInt();
        
        System.out.println("Opncion 1 suma");
        System.out.println("Opcion 2 resta");
        System.out.println("Opcion 3 multiplicacion");
        System.out.println("Opcion 4 division ");
        
        System.out.println("Ingrese la opcion que desea realizar ");
        operacion = Entrada.nextInt();
        if(operacion == 1){
            resultado = numero1 + numero2;
            System.out.println("El resultado de la suma es: " + resultado);
        } if (operacion == 2) { 
            resultado = numero1 - numero2;
            System.out.println("El resultado de la resta es: " + resultado);
        }if (operacion ==  3) { 
            resultado = numero1 * numero2;
            System.out.println("El resultado de la multiplicacion es: " + resultado);
        } if (operacion ==4){ 
            resultado = numero1 / numero2;
            System.out.println("El resultado de la division es: " + resultado);
        }
    }
}

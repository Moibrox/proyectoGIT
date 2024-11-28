
import java.util.Scanner;

public class E1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime dos numeros y ademas vas a elegir que quieres hacer : \n"
                + "Suma 1\n"
                + "Resta 2\n"
                + "Multiplicacion 3\n"
                + "Division 4\n"
                +"Resto de la división 5\n"
                + "Acuerdate de colocar espacio cad vez que ingreses el numero");
        int numero = teclado.nextInt();
        int numero2 = teclado.nextInt();
        int activar = teclado.nextInt();
        switch (activar) {
            case 1:
                int suma = numero + numero2;
                System.out.println(numero + " + " + numero2 + " =" + suma);
                break;
            case 2:
                int resta = numero - numero2;
                System.out.println(numero + " - " + numero2 + " =" + resta);
                break;
            case 3:
                int multiplicacion = numero * numero2;
                System.out.println(numero + " * " + numero2 + " =" + multiplicacion);
                break;
            case 4:
                if (numero2 != 0) {
                    System.out.println("Resultado: " + (numero/ numero2));
                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
                break;
            case 5:
                if (numero2 != 0) {
                    System.out.println("Resultado (resto): " + (numero % numero2));
                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

    }

}

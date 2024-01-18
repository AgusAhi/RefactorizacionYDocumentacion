import java.util.Scanner;

public class CalculadoraCientifica {

    public static int opcion;
    public static double resultado = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora científica.");
        System.out.print("Seleccione una operación (1: Suma, 2: Resta, 3: Multiplicación, 4: División, 5: Potencia, 6: Raíz cuadrada): ");

        opcion = scanner.nextInt();

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        Operaciones(num1, num2);
    }

    private static void Operaciones(double num1, double num2) {
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    return;
                }
                break;
            case 5:
                resultado = Math.pow(num1, num2);
                break;
            case 6:
                if (num1 >= 0) {
                    resultado = Math.sqrt(num1);
                } else {
                    System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Opción no válida.");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }
} 
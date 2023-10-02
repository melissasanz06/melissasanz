import java.util.Scanner;
public class triangulo {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        double l1, l2, l3;
        System.out.print("Introduzca el Valor Numerico del 1 Lado:");
        l1 = lector.nextDouble();
        System.out.print("Introduzca el Valor Numerico del 2 Lado:");
        l2 = lector.nextDouble();
        System.out.print("Introduzca el Valor Numerico del 3 Lado:");
        l3 = lector.nextDouble();
        if (l1 == l2 && l2 == l3)
            System.out.println("\nEl Triangulo es Equilatero\n");
        else {
            if (l1 == l2 || l1 == l3 || l2 == l3)
                System.out.println("\nEl Triangulo es Isoceles");
            else {
            }

        }
    }
}
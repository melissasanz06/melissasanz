import java.util.Scanner;

public class ciencincuenta {

    public static void main(String[] args) {
        int cin=50;
        int cn=100;
        Scanner escaner = new Scanner(System.in);
        System.out.println("ingresa un numero:");
        double fifty = escaner.nextDouble();
        if (fifty>=cn){
            System.out.println("es mayor que 100");

        } else if (fifty<=cin) {
            System.out.println("es menor que 50");

        }
}
}

import java.util.Scanner;

public class menoscn {
    public static void main(String[] args) {
        int pos=100;
        int neg=-100;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Escribe un numero:");
        double cien = escaner.nextDouble();
        if (cien>=pos){
            System.out.println("es mayor");

        } else if (cien<=neg) {
            System.out.println("es menor");

        }
    }
}



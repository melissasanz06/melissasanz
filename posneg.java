import java.util.Scanner;
public class posneg {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Escribe un número:");
        double numero = escaner.nextDouble();
        if(numero>0){
            System.out.println("es positivo:");
        } else if (numero!=0) {
            System.out.println("no es igual a cero ");

        }

    }
    }

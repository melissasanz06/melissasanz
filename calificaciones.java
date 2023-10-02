import java.util.Scanner;
public class calificaciones {
    public static void main(String[] args) {
        int m2=60;
        int min=100;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Escribe la nota final:");
        double calificacion = escaner.nextDouble();
if (calificacion>=m2){
    System.out.println("you win");

} else if (calificacion<=min) {
    System.out.println("fatality");

}
    }
    }

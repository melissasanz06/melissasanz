import java.util.Scanner;
public class diesvenite {
    public static void main(String[] args) {
        int n1=10;
        int n2=20 ;

        Scanner dv=new Scanner(System.in);
        System.out.println("ingresa un numero ");
        n1=dv.nextInt();
        if(n1>n2){
            System.out.println(n1 +"es mayor que 10");
        }else if(n1<n2){
            System.out.println(n1  +"es menor que 20");

        }

    }
}

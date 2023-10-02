import java.util.Scanner;
public class conducir {
    public static void main(String[] args) {
        int años = 18;
        Scanner adulto = new Scanner(System.in);
        System.out.println("tu edad:");
        double adultos = adulto.nextDouble();
        if (adultos==años) {
            System.out.println("eres un adulto chiquito, que puede conseguir licencia de conducir");
        } else if(adultos>años) {
            System.out.println("eres un adulto y cuentas con licencia de conducir");
            }else{
            System.out.println("eres un bb");
            }


        }
    }


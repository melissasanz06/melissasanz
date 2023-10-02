public class jp {
    public static void main(String[] args) {
        String original = "el mejor lenguaje de la programacion es Java";
        String subcadena = "Java";
        if (original.contains(subcadena)) {
            System.out.println("La cadena original contiene la subcadena");
        } else {
            System.out.println("No contiene la subcadena");
        }
    }
}

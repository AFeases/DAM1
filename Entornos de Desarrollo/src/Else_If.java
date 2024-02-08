public class Else_If {
    public static void main(String[] args) {

        String valor = "A";

        if (valor.length()!=1) {
            System.out.println("Error");

        }else {

            if ("aeiou".contains(valor.toLowerCase())) {
                System.out.println("Es una vocal");
            } else if ("bcdfghjklmnñpqrstvwxyz".contains(valor.toLowerCase())) {
                System.out.println("Es una consonante");
            } else {
                System.out.println("Desconocido");
            }
        }
    }
}

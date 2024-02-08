public class Switch_like_if {
    public static void main(String[] args) {

        int numero=7;
        System.out.print(numero + " es un ");

        switch (numero%2){
            case 0:
                System.out.print("Numero Par");
                if (numero<0){
                    System.out.println(" y un Numero Par");
                }
                break;

            case -1:
                System.out.print("Numero Negativo y un ");
            case 1:
                System.out.println("Numero Impar");
                break;
            default:
                System.out.println("Error");
                break;
        }



    }
}

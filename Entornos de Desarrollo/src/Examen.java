public class Examen {
    public static void main(String[] args) {

        int nota = (int) 4;

        switch (nota){
            case 4:
                System.out.print("Casi, pero estas ");
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.printf("Suspenso. Tu nota es: %d", nota);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.printf("Aprobaste, tu nota es: %d", nota);
                break;
            case 10:
                System.out.printf("Perfecto, tu nota es de %d", nota);
                break;
            default:
                System.out.println("Fuera de rango");
                break;


        }
    }
}

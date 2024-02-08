public class Velocidad {
    public static void main(String[] args) {

        int velocidad = 30;
        // Acciones: acelera = 1, frena = 0
        int accion = 1;


        while (velocidad>=0 && velocidad<=400) {
            System.out.printf("La velocidad actual es: %d.\n", velocidad);
            switch (accion){
                case 1:
                    velocidad += 10;
                    break;
                case 0:
                    velocidad -= 10;
                    break;
                default:
                    System.out.println("Se encontro un fallo en el motor, la velocidad se esta reduciendo");
                    velocidad -= 10;
            }
            if (velocidad>320){
                System.out.println("Velocidad maxima alcanzada" +
                        "\n Error, colision detectada, llamando al 112");
                break;
            }
            if (velocidad<0){
                System.out.println("Vehiculo detenido");
                break;
            }
        }

    }
}

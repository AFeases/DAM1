public class Sencillo {
    public static void main(String[] args) {

        boolean camino1 = true;
        boolean camino2 = false;

        if (camino1){
            if (camino2){
                System.out.println("Fuiste por los dos caminos");
            }else {
                System.out.println("Solo fuiste por el primero");
            }
        }else {
            if (camino2){
                System.out.println("Solo fuiste por el segundo");
            }else {
                System.out.println("No fuiste por ninguno");
            }
        }
        System.out.println("End");
    }
}

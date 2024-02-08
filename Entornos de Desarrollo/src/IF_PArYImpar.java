public class IF_PArYImpar {
    public static void main(String[] args) {

        int valor=0;

        while (valor!=10){
            System.out.print(++valor);
            if (valor<0 || valor>10){
                System.out.println("Error");
                break;
            }
            if (valor%2!=0){
                System.out.println(" es impar");
            }else {
                System.out.println();
            }
        }

    }
}
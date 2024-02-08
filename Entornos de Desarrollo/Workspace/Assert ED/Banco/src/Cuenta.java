public class Cuenta {
    private String numero;
    private float saldo;
       public Cuenta(String numCta, float saldoCta){
           numero=numCta;
           saldo=saldoCta;
       }
       public String getNumero(){
           return numero;
       }
       public void setNumero( String numeroCta){
           this.numero = numeroCta;
       }
       public float getSaldo(){
           return saldo;
       }
       public void setSaldo(float saldoCta){
           this.saldo = saldoCta;
       }
       public void ingresarDinero (float importe){
           saldo+=importe;
       }
       //public void extraerDinero(float importe){
       //    saldo-=importe;
       //}
       public void extraerDinero(float importe){
           if (saldo-importe<0){
               throw new java.lang.ArithmeticException("Saldo Negativo");
           }else {
               saldo-=importe;
           }
           
       }
       public void mostrarCuenta(){
           System.out.println("El numero de cuenta es: " + getNumero());
           System.out.println("El saldo es: " + getSaldo() + "€");
       }
   
       
   }
   
   
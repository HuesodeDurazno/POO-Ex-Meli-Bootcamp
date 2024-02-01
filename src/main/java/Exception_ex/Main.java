package Exception_ex;

public class Main {
    public static void main(String[] args) {
        int a= 0; int b = 300;
        try{
            System.out.println("Entrando en el try");
            int res = b/a;
        }catch (ArithmeticException e){
            System.out.println("Se ha producido un error");
            throw new IllegalArgumentException("No se puede dividir por zero");
        }finally{
            System.out.println("Programa finalizado");
        }

    }
}

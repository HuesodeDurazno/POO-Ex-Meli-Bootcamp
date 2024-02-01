package Persona;


public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("benito",12,"asda121412312");
        Persona persona3 = new Persona("pedro",13,"1238bbjkku",76.4f,180.33f);

        System.out.println(String.format("Es mayor de edad: %b \n Datos : %s \n IMC: %d",
                                                            persona3.esMayorDeEdad(),
                                                            persona3.toString(),
                                                            persona3.calcularIMC()));
    }
}

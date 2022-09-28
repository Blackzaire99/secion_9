public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
    }
}
class Persona {
    String Nombre = "";
    int Edad = 0;
    int Telefono = 0;
}

class Cliente extends Persona {
    public void credito() {
        System.out.println("Soy un Cliente");
    }
    public int edad = 0 ;{
        System.out.println("su edad es: " + edad);
    }
    public int telefono = 0 ;{
        System.out.println("el numero de contacto es: " + telefono);
    }
    public void asiganacion (double a, double b) {
        System.out.println("spy el cliente: ");
        System.out.println("El credito es:" + (a + b));
    }
}
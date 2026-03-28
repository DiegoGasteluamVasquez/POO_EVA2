
package eva2_11_herencia_interfaces;

public class EVA2_11_HERENCIA_INTERFACES {

    public static void main(String[] args) {
        
    }
    
}

class Demostracion implements OtraPrueba{
    
    @Override
    public void saludar(String mensaje) {
        System.out.print(mensaje);
    }

    @Override
    public void mostrarMensaje() {
        System.out.print("Sí");
    }
    
}

interface Prueba{
    public void mostrarMensaje();
}
interface OtraPrueba extends Prueba{//Herencia
    public void saludar(String mensaje);
}
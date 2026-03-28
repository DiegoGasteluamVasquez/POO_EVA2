/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_10_interfaces_herencia;

public class Empleado extends Persona implements Mensaje{
    private String puesto;
    private double salario;
    
    public Empleado() {
        super();
        this.puesto = "";
        this.salario = 0.0;
    }

    public Empleado(String puesto, double salario, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.puesto = puesto;
        this.salario = salario;
    }
    public String getPuesto() {
        return puesto;
    }
    public double getSalario() {
        return salario;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void mostrarMensaje() {
        System.out.print("Nombre: " + getNombre());
        System.out.print("Apellido: " + getApellidos());
        System.out.print("Edad: " + getEdad());
        System.out.print("Puesto: " + puesto);
        System.out.print("Salario: " + salario);
    }
    
}

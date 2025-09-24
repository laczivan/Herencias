/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_vehiculo;

/**
 *
 * @author zunig
 */
public class Vehiculo {
   
    private String nombreVehiculo;
    private String tipo;
    public Vehiculo(String nombreVehiculo, String tipo){
      this.nombreVehiculo=nombreVehiculo;
      this.tipo=tipo;
    }

    public String getNombreVehiculo() {
        return nombreVehiculo;
    }

    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void transportar(){
        System.out.println("Transporta al rededor de 6 personas");
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }


}


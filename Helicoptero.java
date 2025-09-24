/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_vehiculo;

/**
 *
 * @author zunig
 */
public class Helicoptero extends Aereo{
    private String tipoHelicoptero;
    
    public Helicoptero(String nombreVehiculo, String tipoVehiculo,
            String nombreAereo, String tipoAereo, String tipoHelicoptero){
        super(nombreVehiculo, tipoVehiculo, nombreAereo,
                tipoAereo);
        this.tipoHelicoptero=tipoHelicoptero;
    }
    public void activarHelices(){
        System.out.println("Helices activadas");
    }

    @Override
    public void transportar() {
        super.transportar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void Volar() {
        super.Volar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getTipoHelicoptero() {
        return tipoHelicoptero;
    }

    public void setTipoHelicoptero(String tipoHelicoptero) {
        this.tipoHelicoptero = tipoHelicoptero;
    }
    
}

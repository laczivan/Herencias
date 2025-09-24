/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_vehiculo;

/**
 *
 * @author zunig
 */
public class Avion extends Aereo {
    private String tipoAvion;
    
    public Avion(String nombreVehiculo, String tipoVehiculo,
            String nombreAereo, String tipoAereo, String tipoAvion){
        super(nombreVehiculo, tipoVehiculo, nombreAereo, tipoAereo);
        this.tipoAvion=tipoAvion;
    }
    public void aterrizar(){
        System.out.println("Aterrizando...");
        
    }
    public String getTipoAvion(){
        return tipoAvion;
    }
    public void setTipoAvion(String tipoAvion){
        this.tipoAvion= tipoAvion;
    }
    

    @Override
    public void transportar() {
        super.transportar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}

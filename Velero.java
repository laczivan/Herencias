/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_vehiculo;

/**
 *
 * @author zunig
 */
 public class Velero extends Barco {
     private String tipoVelero;

    public String getTipoVelero() {
        return tipoVelero;
    }

    public void setTipoVelero(String tipoVelero) {
        this.tipoVelero = tipoVelero;
    }
   
    
    public Velero(String nombreVehiculo, String tipoVehiculo,
            String nombreAcuatico, String tipoAcuatico,
            String tipoBarco, String tipo ){
        super(nombreVehiculo, tipoVehiculo, nombreAcuatico,
                tipoAcuatico, tipoBarco);
        this.tipoVelero=tipoVelero;
        
    }
    public void alzarVelas(){
        System.out.println("Se alzan las velas");
    }
    
}

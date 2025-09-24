/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_vehiculo;

/**
 *
 * @author zunig
 */
public class Barco extends Acuatico{
   private String tipoBarco;
        public Barco(String nombreVehiculo, String tipoVehiculo,
                String nombreAcuatico, String tipoAcuatico,
                String tipoBarco){
            
            super(nombreVehiculo, tipoVehiculo,
                    nombreAcuatico, tipoAcuatico);
            this.tipoBarco=tipoBarco;
        }
        public void prenderMotor(){
            System.out.println(getNombreAcuatico());
        }

    public String getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(String tipoBarco) {
        this.tipoBarco = tipoBarco;
    }    
}

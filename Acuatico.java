/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_vehiculo;

/**
 *
 * @author zunig
 */
public class Acuatico extends Vehiculo {
    private String nombreAcuatico;
    private String tipoAcuatico;
    
    public Acuatico(String nombreVehiculo, String tipoVehiculo,
            String nombreAcuatico, String tipo){
        super(nombreVehiculo, tipoVehiculo);
        this.nombreAcuatico=nombreAcuatico;
        this.tipoAcuatico=tipoAcuatico;
    }
    public void navegar(){
        System.out.println(nombreAcuatico);
    }

    public String getNombreAcuatico() {
        return nombreAcuatico;
    }

    public void setNombreAcuatico(String nombreAcuatico) {
        this.nombreAcuatico = nombreAcuatico;
    }

    public String getTipo() {
        return tipoAcuatico;
    }

    public void setTipo(String tipo) {
        this.tipoAcuatico = tipo;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_vehiculo;

/**
 *
 * @author zunig
 */
public class Aereo extends Vehiculo {
    private String nombreAereo;
    private String tipoAereo;
    public Aereo(String nombreVehiculo, String tipoVehiculo,
            String nombreAereo, String tipoAereo){
        super(nombreVehiculo, tipoVehiculo);
        this.nombreAereo=nombreAereo;
        this.tipoAereo=tipoAereo;
    }
    public void Volar(){
        System.out.println(nombreAereo);
    }

    @Override
    public void transportar() {
        super.transportar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public String getNombreAereo() {
        return nombreAereo;
    }

    public void setNombreAereo(String nombreAereo) {
        this.nombreAereo = nombreAereo;
    }

    public String getTipoAereo() {
        return tipoAereo;
    }

    public void setTipoAereo(String tipoAereo) {
        this.tipoAereo = tipoAereo;
    }
    
}

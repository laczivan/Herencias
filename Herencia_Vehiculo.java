/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia_vehiculo;

/**
 *
 * @author zunig
 */
public class Herencia_Vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("BARCO");
        Barco b = new Barco("Acuatico", "Yate", "Privado", "Ldr35", "Pasajeros");
        b.prenderMotor();
        b.navegar();
        b.transportar();
        
        System.out.println("VELERO");
        Velero v = new Velero("Acuatico", "Velas", "pasajeros", "Turistas", "Publico", "AFR 54");
        v.alzarVelas();
        v.navegar();
        v.prenderMotor();
        
        
        System.out.println("AVION");
        Avion av = new Avion("Aereo", "privado",
        "Boeing 7373", "Jet", "Pasajeros");
        av.transportar();
        av.Volar();
        av.aterrizar();
        System.out.println("Tipo avion: " + av.getTipoAvion());
       
        
        System.out.println("Helicoptero");
        Helicoptero h = new Helicoptero("Aereo", "Militar",
        "Black", "Rotatorio", "Transporte militar");
        h.transportar();
        h.Volar();
        h.activarHelices();
       
      
    }
    
}

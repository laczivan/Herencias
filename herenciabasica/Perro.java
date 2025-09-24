/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciabasica;

/**
 *
 * @author zunig
 */
//la palabra reservada para herencia es extends
public class Perro extends Animal{
    private String raza;
    public Perro (String nombre, String Raza){
        //palabra reservada para acceder a las caracteristicas del padre
        //super
        super(nombre);
        this.raza=raza;
    }
    @Override 
    public void makeNoise(){
        System.out.println("bark bark bark");
        
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void moverCola(){
        System.out.println(super.getNombre());
    }   
}

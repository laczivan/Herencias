/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciabasica;

/**
 *
 * @author zunig
 */
public class Animal {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    public void makeNoise(){
        System.out.println("Sonido generico de un animal");
    }
}

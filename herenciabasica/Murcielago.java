/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciabasica;

/**
 *
 * @author zunig
 */
public class Murcielago extends Animal {
    private String raza;
     public Murcielago(String nombre, String raza, String volar){
            super(nombre);
            this.raza=raza;
        }
        @Override 
        public void makeNoise(){
            System.out.println("iiiiiii");
        }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void volar(){
        System.out.println(super.getNombre());
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciabasica;

/**
 *
 * @author zunig
 */
public class Pato extends Animal {
    private String raza;
    
     public Pato(String nombre, String raza, String nadar){
            super(nombre);
            this.raza=raza;
        }
        @Override 
        public void makeNoise(){
            System.out.println("cuak cuak cuak");
        }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void nadar(){
        System.out.println(super.getNombre());
    }
    
    
}

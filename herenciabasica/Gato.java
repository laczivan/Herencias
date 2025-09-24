/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciabasica;

/**
 *
 * @author zunig
 */
    public class Gato extends Animal{
        private String raza;
        
        public Gato(String nombre, String raza, String ronronear){
            super(nombre);
            this.raza=raza;
        }
        @Override 
        public void makeNoise(){
            System.out.println("grrrrr");
        }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void ronronear(){
        System.out.println(super.getNombre());
    }
    }


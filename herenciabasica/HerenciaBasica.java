package herenciabasica;

/**
 *
 * @author zunig
 */
public class HerenciaBasica {

  
    public static void main(String[] args) {
        System.out.println("Herencia 1");
        Animal a = new Animal("Criatura extraña");
        a.makeNoise();
        Perro p = new Perro("Firulais", "Labrador");
        p.makeNoise();
        p.moverCola();
        Gato g = new Gato("Michi", "Egipcio", "grrr");
        g.makeNoise();
        g.ronronear();
        Pato pt = new Pato("Patito Juan", "Pato normal", "Cuak");
        pt.makeNoise();
        pt.nadar();
        Murcielago m = new Murcielago("Murci", "Batman", "iiiii");
        m.makeNoise();
        m.volar();
        //crear clase gato que heredara de animal
    }
}

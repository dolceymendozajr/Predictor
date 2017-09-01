package Modelo;

import java.util.Queue;

/**
 *
 * @author https://github.com/dolceymendozajr
 */
public class Nodo {
    
    private char letra;
    private static Queue<Nodo> hijos;

    public Nodo(char letra) {
        this.letra = letra;
    }

    public Queue<Nodo> getHijos() {
        return hijos;
    }

    public void setHijo(Nodo hijo) {
        this.hijos.add(hijo);
    }
    
    
    
}

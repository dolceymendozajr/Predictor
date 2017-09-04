package Modelo;

import java.util.Queue;

/**
 *
 * @author https://github.com/dolceymendozajr
 */
public class Nodo {
    
    private char letra;
    private Queue<Nodo> hijos;

    public Nodo(char letra) {
        this.letra = letra;
    }

    public Queue<Nodo> getHijos() {
        return hijos;
    }

    public void addHijo(char letra) {
        this.hijos.add(new Nodo(letra));
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    
    
    
    
}

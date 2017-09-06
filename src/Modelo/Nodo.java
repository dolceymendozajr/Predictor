package Modelo;

import java.util.Queue;

/**
 *
 * @author https://github.com/dolceymendozajr
 */
public class Nodo {
    
    private char letra;
    private Nodo[] hijos = new Nodo[30];

    public Nodo(char letra) {
        this.letra = letra;
    }

    public void Añadir(String palabra){
        Nodo actual=this;
        int tamaño = palabra.length();
        for (int i = 0; i < tamaño; i++) {
            char letra = palabra.charAt(i);
            int ascii = (int)letra-97;
            if (actual.hijos[ascii]==null) {
                actual.hijos[ascii]=new Nodo(letra);
            }
            actual=actual.hijos[ascii];
        }
        actual.hijos[29]=new Nodo('$');
    }
    
    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    
    
    
    
}

package Controlador;

import Modelo.Nodo;
import Vista.Predictor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Queue;

/**
 *
 * @author https://github.com/dolceymendozajr
 */
public class Main {

    private static Nodo root = new Nodo('#');
    
    public static void main(String[] args) throws IOException {
        Predictor vista = new Predictor();
        vista.setVisible(true);
        CargarArchivo();
    }
    
    public void Insertar(Nodo n) {
        if (n != null) {
            Queue<Nodo> c = n.getHijos();
            if (n.getLetra() == c.peek().getLetra()) {
                Insertar(c.remove());
            }
        }
    }

    public void Mostrar(Nodo a) {
        if (a != null) {
            Queue<Nodo> c = a.getHijos();
            System.out.println(c.peek().getLetra());
            Mostrar(c.remove());
        }
    }
    
    public static void CargarArchivo() throws IOException{
        File archivo = new File("archivo.txt");
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            int t=0;
            while ((linea = br.readLine())!=null) {                
                t = linea.length();
                for (int i = 0; i < t; i++) {
                    char letra=linea.charAt(i);
                    root.addHijo(letra);
                }
                
            }
        } catch (FileNotFoundException f) {
            System.out.println("Archivo no existente");            
        }
    }
    
}

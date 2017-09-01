package Controlador;

import Modelo.Arbol;
import Modelo.Nodo;
import Vista.Predictor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author https://github.com/dolceymendozajr
 */
public class Main {

    public static void main(String[] args) {
        Predictor vista = new Predictor();
        vista.setVisible(true);
    }
    
    public void CargarArchivo() throws IOException{
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
                    Nodo a = new Nodo(letra);
                    Arbol.root.setHijo(a);
                }
                
            }
        } catch (FileNotFoundException f) {
            System.out.println("Archivo no existente");            
        }
    }
    
}

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

    public static void main(String[] args) throws IOException {
        Predictor vista = new Predictor();
        vista.setVisible(true);
        CargarArchivo();
    }

    public static void CargarArchivo() throws IOException {
        Nodo root = new Nodo('#');
        File archivo = new File("archivo.txt");
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            int t = 0;
            while ((linea = br.readLine()) != null) {
                t = linea.length();
                root.Añadir(linea);
            }
        } catch (FileNotFoundException f) {
            System.out.println("Archivo no existente");
        }
    }

}

package Controlador;

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

    static Nodo root = new Nodo('#');

    public static void main(String[] args) throws IOException {
        Predictor vista = new Predictor();
        vista.setVisible(true);
        CargarArchivo();
    }

    public static void CargarArchivo() throws IOException {
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

    public static String Prediccion(String t) {
        int a = t.length();
        for (int i = 0; i < a; i++) {
            char b = t.charAt(i);
            boolean z=Busqueda(b, root);
//            if (Busqueda(b, root)) {
//                return Character.toString(b);
//            } else {
//                return Character.toString(root.getLetra());
////                String rec = t.substring(0,a-1);
////                Prediccion(rec);
//            }
        }
        return "Favor ver consola \n[Esta versión es incompleta]";
    }

    public static boolean Busqueda(char a, Nodo r) {
        if (r != null || r.getLetra() != '$') {
            int cod = (int)a-97;
            System.out.println(r.getLetra());
            if (a == r.getLetra()) {
                return true;
            } else {
                return Busqueda(a, r.getHijos()[cod]);
            }
        } else {
            return false;
        }
    }

}

//package Modelo;
//
//import Controlador.Main;
//import java.util.Queue;
//import javax.swing.JOptionPane;
//
///**
// *
// * @author https://github.com/dolceymendozajr
// */
//public class Arbol {
//
//    public static Nodo root = new Nodo('#');
//    
//    
//
//    public void Insertar(Nodo n) {
//        if (n != null) {
//            Queue<Nodo> c = n.getHijos();
//            if (n.getLetra() == c.peek().getLetra()) {
//                Insertar(c.remove());
//            }
//        }
//    }
//
//    public void Mostrar(Nodo a) {
//        if (a != null) {
//            Queue<Nodo> c = a.getHijos();
//
//            System.out.println(c.peek().getLetra());
//            Mostrar(c.remove());
//        }
//    }
//    
//}

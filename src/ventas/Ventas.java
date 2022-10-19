/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventas;

import Dominio.*;
import datos.*;


/**
 *
 * @author Alumno Mañana
 */
public class Ventas {

    /**
     * 
     * @param args the command line arguments
     */
    
  
    
    public static void main(String[] args) {
        // TODO code application logic here
        
     Orden orden1 = new Orden();
     Orden orden2 = new Orden();
     Orden orden3 = new Orden();
     
     Producto Prod1 = new Producto("Cereales", 2);
     Producto Prod2 = new Producto("Arroz", 1.12);
     
     Producto Prod3 = new Producto("Espaguettis", 0.75);
     Producto Prod4 = new Producto("Lasaña", 5);
     
     Producto Prod5 = new Producto("Cereales", 2);
     Producto Prod6 = new Producto("Verduras salteadas", 2.60);
     
     Producto Prod7 = new Producto("Paella congelada", 3.30);
     Producto Prod8 = new Producto("Burritos", 2.50);
     
     Producto Prod9 = new Producto("Pizza Jamón y Queso", 3.50);
     Producto Prod10 = new Producto("Cereales", 2);
     
     Producto Prod11 = new Producto("Chocolate Milka", 1.75);
     
     
     
     
     
     orden1.agregarrProducto(Prod1);
     orden1.agregarrProducto(Prod2);
     orden1.agregarrProducto(Prod3);
     orden1.agregarrProducto(Prod4);
     orden1.agregarrProducto(Prod5);
     orden1.agregarrProducto(Prod8);
     orden1.agregarrProducto(Prod10);
     orden1.agregarrProducto(Prod11);
     
     
     orden2.agregarrProducto(Prod3);
     orden2.agregarrProducto(Prod5);
     orden2.agregarrProducto(Prod7);
     orden2.agregarrProducto(Prod9);
     
     
     orden3.agregarrProducto(Prod1);
     orden3.agregarrProducto(Prod2);
     orden3.agregarrProducto(Prod3);
    
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        orden3.mostrarOrden();
    
        System.out.println(orden1.calcularTotal()+"$");
        System.out.println("=====");
        System.out.println(orden2.calcularTotal()+"$");
        System.out.println("=====");
        System.out.println(orden3.calcularTotal()+"$");
        
        
        
        String nombreArchivo = "ordenes.txt";
       
        
        ImplAccesoDatos IAD = new ImplAccesoDatos();
       IAD.crear(nombreArchivo);
       IAD.escribir(nombreArchivo,  orden1);
       IAD.leer(nombreArchivo);
     
    }
}
    


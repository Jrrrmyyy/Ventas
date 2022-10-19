/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventas;

import Productos.Producto;
import Ordenes.Orden;


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
     
     
     
     
     
     orden1.agregarProducto(Prod1);
     orden1.agregarProducto(Prod2);
     orden1.agregarProducto(Prod3);
     orden1.agregarProducto(Prod4);
     orden1.agregarProducto(Prod5);
     orden1.agregarProducto(Prod6);
     orden1.agregarProducto(Prod7);
     orden1.agregarProducto(Prod8);
     orden1.agregarProducto(Prod9);
     orden1.agregarProducto(Prod10);
     orden1.agregarProducto(Prod11);
    
    orden1.mostrarOrden();
        System.out.println(orden1.calcularTotal()+"$");
     
    }
}
    


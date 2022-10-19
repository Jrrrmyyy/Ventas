/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenes;
import Productos.Producto;
import java. util. ArrayList;
import java.util.Scanner;
/**
 *
 * @author Alumno Mañana
 */
public class Orden extends Producto {
    
  
    private ArrayList<Producto> Prods = new ArrayList<>();
    
    private int idOrden;
    private static int cont;
    private static int maximoProd = 10;

    public Orden() {
        this.idOrden = ++cont;
    }
    
    /*public void agregarProducto(Producto producto){
        if(maximoProd == 0){
            System.out.println("Está llena tu caja de productos");
        }else{
            maximoProd--;
            this.Prods.add(producto);
        }
    }*/
    
    public void agregarrProducto(Producto producto){
        if (Prods.size()>=maximoProd){
            System.out.println("Tu caja está llena de productos");
        }else
           
        this.Prods.add(producto);
    }

    public double calcularTotal(){
        double total=0;
        for (Producto prod : Prods) {
            total+=prod.getPrecio() ;
        }
        return total;
    }
    
    public void mostrarOrden(){
        for (Producto prod : Prods) {
            System.out.println(idOrden +" "+prod); ;
        }
    }
    
}

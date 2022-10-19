/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Producto {
    
   
    
   
        private int IdP;
        private String nombre;
        private double precio;

        private static int contProducto;

    public Producto(String nombre, double precio) {
        this.IdP = ++contProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
        this.IdP = ++contProducto;
    }

    public int getIdP() {
        return IdP;
    }

    public void setIdP(int IdP) {
        this.IdP = IdP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContProducto() {
        return contProducto;
    }

    public static void setContProducto(int contProducto) {
        Producto.contProducto = contProducto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.IdP;
        hash = 17 * hash + this.contProducto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.IdP != other.IdP) {
            return false;
        }
        if (this.contProducto != other.contProducto){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("- Código del producto ").append(IdP);
        sb.append(", ").append(nombre);
        sb.append(", ").append(precio+"$");
        sb.append('}');
        return sb.toString();
    }

    
    
  
        
   
        
}

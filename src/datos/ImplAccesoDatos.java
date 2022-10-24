/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Dominio.Orden;
import Dominio.Producto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class ImplAccesoDatos implements CRUD {
    
    public  void crear(String nombre) {
        File archivo =new File(nombre);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            
        } catch (FileNotFoundException ex) {
            
            ex.printStackTrace(System.out);
            
        }
                
    }
    
    /*public static void escribir(String nombre,String contenido) {
        File archivo =new File(nombre);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            System.out.println("Se ha creado el fichero");
            salida.close();
            
        } catch (FileNotFoundException ex) {
            
            ex.printStackTrace(System.out);
            
        }
                
    }*/
    
    public  void agregar(String nombre,Orden contenido) {
        File archivo =new File(nombre);
        PrintWriter salida =null;
        try {
            salida = new PrintWriter(new FileWriter(nombre, true));
            salida.println(contenido);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } finally {
            salida.close();
        }
                
    }
    
        public  void agregarStock(String nombre,Producto contenido) {
        File archivo =new File(nombre);
        PrintWriter salida =null;
        try {
            salida = new PrintWriter(new FileWriter(nombre, true));
            salida.println(contenido);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } finally {
            salida.close();
        }
                
    }
    
    /*public static void leer(String nombre){
        BufferedReader entrada = null;
        File archivo =new File(nombre);
        try {
            entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            
            while(lectura != null){
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }*/
    
   /* public static void leerPorPalabra(String nombre){
        File archivo =new File(nombre);
        try {
            Scanner entrada = new Scanner(archivo);
            int cont=0;
            while(entrada.hasNext()){
                String palabra = entrada.next();
                System.out.println(palabra);
                cont++;
            }
            System.out.println("Numero de palabras = "+cont);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
*/
    public  void escribir(String nombre, Orden contenido) {
        PrintWriter salida = null;
        File archivo =new File(nombre);
        try {
            salida = new PrintWriter(archivo);
            salida.print(contenido);
            System.out.println("Se ha creado el fichero");
            salida.close();
            
        } catch (FileNotFoundException ex) {
            
            ex.printStackTrace(System.out);
            
        }
    }

       public  void escribirStock(String nombre, Producto contenido) {
        PrintWriter salida = null; 
        File archivo =new File(nombre);
        try {
            salida = new PrintWriter(archivo);
            salida.println(contenido);
            System.out.println("Se ha creado el fichero");
            salida.close();
            
        } catch (FileNotFoundException ex) {
            
            ex.printStackTrace(System.out);
            
        }
    }
   

  
    

    
    public void leer(String nombre) {
         BufferedReader entrada = null;
        File archivo =new File(nombre);
        try {
            entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            
            while(lectura != null){
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}

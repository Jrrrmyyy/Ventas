/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import Dominio.Orden;

/**
 *
 * @author Alumno Mañana
 */
public interface CRUD {
    
    public abstract void crear(String nombre);
    
    public abstract void escribir(String nombre, Orden contenido);
    
    public abstract void leer(String nombre);
    
}

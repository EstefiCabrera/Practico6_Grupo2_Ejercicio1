/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import entidades.Producto;
import java.util.ArrayList;

/**
 *
 * @author estef
 */
public class ProductoData {
    private ArrayList<Producto> lista= new ArrayList<>();
    
    public void agregarProductos(Producto p){

        lista.add(p);
    }
    
     public ArrayList<Producto> obtenerProductos(){
            return lista;
        }
     
     
}

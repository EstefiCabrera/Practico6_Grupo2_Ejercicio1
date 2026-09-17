/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import entidades.Categoria;
import entidades.Producto;
import java.util.ArrayList;

/**
 *
 * @author estef
 */
public class CategoriaData {
        private ArrayList<Categoria> lista = new ArrayList<>(); 
            
        public CategoriaData(){
            lista.add(new Categoria("Perfumeria"));
            lista.add(new Categoria ("Almacen"));
            lista.add(new Categoria ("Farmacia"));
            lista.add(new Categoria ("Indumentaria"));
        }
        
        public ArrayList<Categoria> obtenerCategoria(){
            return lista;
        
        }
}

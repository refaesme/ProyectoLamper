/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussiness;
import entities.Producto;
import java.util.ArrayList;

/**
 *
 * @author plataforma
 */
public class ProductoDAO {
    
    
    ArrayList<Producto> listaProductos;

    public ProductoDAO(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void guardarProducto(Producto producto) {
        if(this.listaProductos.contains(producto)){
            this.listaProductos.add(this.listaProductos.indexOf(producto),producto);
        }else{
            this.listaProductos.add(producto);
        }
        
    }
    
    public Producto getProductoByCodigo(int codigo){
    
        Producto productoRetorno = null;
        
        for(Producto producto : this.listaProductos){
            
            if(producto.getCodigo()== codigo){
                
                productoRetorno = producto;
            }
        
        }
        
        return productoRetorno;
    }
    
    
    public boolean eliminarProducto(int codigo){
        
        boolean respuesta = false;
        
        for(Producto producto : this.listaProductos){
            
            if(producto.getCodigo()== codigo){
                
                respuesta = this.listaProductos.remove(producto);
            }
        
        }
    
        return respuesta;
    }
    
    public ArrayList<Producto> getProductos(){
        return this.listaProductos;
    }
}

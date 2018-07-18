/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.appinventario.dao;

import co.com.appinventario.model.Producto;
import java.util.List;

/**
 *
 * @author giovanny
 */
public interface IProductoDao {
    
    List<Producto> obtenerProductos();
    Producto obtenerProducto(String codigo);
    void crearProducto(Producto producto);
    void eliminarProducto(String codigo);
    void actualizarProducto(Producto producto);
    
}

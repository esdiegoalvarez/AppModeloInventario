/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.appinventario.business;

import co.com.appinventario.model.Producto;
import java.util.List;

/**
 *
 * @author Diego
 */
public interface IProductoBusiness {
    List<Producto> obtenerProductos();
    Producto obtenerProducto(String codigo);
    String crearProducto(Producto producto);
    String eliminarProducto(String codigo);
    String actualizarProducto(Producto producto); 
}

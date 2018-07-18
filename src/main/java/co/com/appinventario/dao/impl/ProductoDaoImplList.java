/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.appinventario.dao.impl;

import co.com.appinventario.dao.IProductoDao;
import co.com.appinventario.data.ProductoData;
import co.com.appinventario.model.Producto;
import java.util.List;

/**
 *
 * @author giovanny
 */
public class ProductoDaoImplList implements IProductoDao{

    @Override
    public List<Producto> obtenerProductos() {
        return ProductoData.getListado();
    }

    @Override
    public Producto obtenerProducto(String codigo) {
        List<Producto> listado = ProductoData.getListado();
        /*otra forma
        for (Producto p : listado) {
            if(p.getCodigo().equals(codigo)){
                return p;
            }
        }
        */
        // mejorada pero debe de existir el producto
        Producto producto = new Producto(codigo);                    
        return listado.get(listado.indexOf(producto));        
    }

    @Override
    public void crearProducto(Producto producto) {

    }

    @Override
    public void eliminarProducto(String codigo) {

    }

    @Override
    public void actualizarProducto(Producto producto) {

    }
    
}

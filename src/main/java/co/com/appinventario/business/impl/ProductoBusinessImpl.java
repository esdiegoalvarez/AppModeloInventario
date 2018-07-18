/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.appinventario.business.impl;

import co.com.appinventario.business.IProductoBusiness;
import co.com.appinventario.dao.impl.ProductoDaoImplList;
import co.com.appinventario.model.Producto;
import java.util.List;

/**
 *
 * @author Diego
 */
public class ProductoBusinessImpl implements IProductoBusiness {
    
    private final ProductoDaoImplList productoDao = new ProductoDaoImplList();

    @Override
    public List<Producto> obtenerProductos() {
        return productoDao.obtenerProductos();
    }

    @Override
    public Producto obtenerProducto(String codigo) {
        List<Producto> lista = obtenerProductos();
        Producto buscar = new Producto(codigo);
        if(lista.contains(buscar)){
            return productoDao.obtenerProducto(codigo);
        }
        return null;
    }

    @Override
    public String crearProducto(Producto producto) {
        String resp = "Producto ya existe";
        if(obtenerProducto(producto.getCodigo())==null){
            if(producto.getStock()<5){
                return "El stock debe ser mayor o igual a 5";
            }
            if(producto.getCantidad()<=0){
                return "La cantidad debe ser mayor a cero";
            }
            productoDao.crearProducto(producto);
            resp ="Producto Creado";
        }
        return resp;
    }

    
    @Override
    public String eliminarProducto(String codigo) {
        String resp = "Producto no existe";
        if(obtenerProducto(codigo)!=null){
            productoDao.eliminarProducto(codigo);
            resp ="Producto Eliminado";
        }
        return resp;
    }

    @Override
    public String actualizarProducto(Producto producto) {
        String resp = "Producto no existe";
        if(obtenerProducto(producto.getCodigo())!=null){
            productoDao.actualizarProducto(producto);
            resp ="Producto Actualizado";
        }
        return resp;
    }
    
    
}

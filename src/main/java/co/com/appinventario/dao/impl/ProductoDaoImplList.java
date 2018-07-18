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
        List<Producto> listado = ProductoData.getListado(); //traemos la lista
        listado.add(producto); //adicionamos
        ProductoData.setListado(listado); //setteamos para que se guarde en la global ya que el add lo agregó local
    }

    @Override
    public void eliminarProducto(String codigo) {
        List<Producto> listado = ProductoData.getListado(); //traemos la lista
        listado.remove(obtenerProducto(codigo)); //removemos, llamamos a obtener y le enviamos el cod
        ProductoData.setListado(listado);
    }

    @Override
    public void actualizarProducto(Producto producto) {
        List<Producto> listado = ProductoData.getListado(); //traemos la lista
        listado.set(listado.indexOf(producto), producto); //actualizamos, le enviamos el index del producto y la info del mismo
        ProductoData.setListado(listado);
    }
    
}

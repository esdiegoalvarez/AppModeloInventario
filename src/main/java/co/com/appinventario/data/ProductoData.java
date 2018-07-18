/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.appinventario.data;

import co.com.appinventario.model.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giovanny
 */
public class ProductoData {

    private static List<Producto> listado;

    static {
        listado = new ArrayList<>();
    }

    public static List<Producto> getListado() {
        return listado;
    }

    public static void setListado(List<Producto> aListado) {
        listado = aListado;
    }

}

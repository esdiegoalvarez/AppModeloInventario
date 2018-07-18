/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.appinventario.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author giovanny
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
public class Producto {
    
    @NonNull private String codigo;
    @EqualsAndHashCode.Exclude private String descri;
    @EqualsAndHashCode.Exclude private double stock,cantidad;
 
    
    
}

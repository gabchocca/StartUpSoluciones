/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazSym;

import java.util.ArrayList;

/**
 *
 * @author ghuam
 */
public class RegistroDeVenta {
    String textProductoId, fecha, unidadesVendidas;
    int id;
    
    RegistroDeVenta( int id, String textProductoId, String fecha, String unidadesVendidas){
        this.id = id;
        this.textProductoId  = textProductoId;
        this.unidadesVendidas = unidadesVendidas;
        this.fecha = fecha;
    }
};
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
public class GestorDeVentas {
    static ArrayList<RegistroDeVenta> listaDeRegistros = new ArrayList<>();
    static int idRegistroDeVenta = 0;
    static int idABuscar = 0;
    
    public static RegistroDeVenta buscarPorId(int id) {
        for (RegistroDeVenta venta : listaDeRegistros) {
            if (venta.id == id) return venta;
        }
        return null;
    }
}

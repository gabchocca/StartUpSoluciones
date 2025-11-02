
package InterfazSym;

import java.util.ArrayList;

public class RegistroCliente {
        
    public static ArrayList<Cliente> listaClientes = new ArrayList<>();

    public static void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public static ArrayList<Cliente> obtenerClientes() {
        return listaClientes;
    }
}


package InterfazSym;

public class Cliente {
    
    private String nombre;
    private String dni;
    private String telefono;
    private String correo;
    private String direccion;

    public Cliente(String nombre, String dni, String telefono, String correo, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public String getTelefono() { return telefono; }
    public String getCorreo() { return correo; }
    public String getDireccion() { return direccion; }
}





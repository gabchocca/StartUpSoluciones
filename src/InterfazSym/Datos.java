
package InterfazSym;
import java.sql.*;

public class Datos {
    public static  String USUARIO = "";
    public static  int ID_NUM_DOC_VENTA;
    public static  int ID_DCTO_PRODUCTO;
    public static  int ID_DCTO_VENTA;
    public static  int ID_DETALLE_DOC_VENTA;
    public static  int ID_PRODUCTO;
    
    public static void aumentarID_NUM_DOC_VENTA(){ID_NUM_DOC_VENTA++;}
    public static void aumentarID_DCTO_PRODUCTO(){ID_DCTO_PRODUCTO++;}
    public static void aumentarID_DCTO_VENTA(){ID_DCTO_VENTA++;}
    public static void aumentarID_DETALLE_DOC_VENTA(){ID_DETALLE_DOC_VENTA++;}
    public static void aumentarID_PRODUCTO(){ID_PRODUCTO++;}
    
     // Cargar todos los IDs desde la BD al iniciar la app
    public static void cargarIds() {
        cConnection con = new cConnection();
        
        try {

            // === ID_NUM_DOC_VENTA ===
            String query1 = "SELECT MAX(NumDocVenta) FROM CabecDocVenta";
            Statement s1 = con.ObtenerConexion().createStatement();
            ResultSet rs1 = s1.executeQuery(query1);
            if (rs1.next()) {
                ID_NUM_DOC_VENTA = rs1.getInt(1) + 1;
            }
            rs1.close();
            s1.close();

            
            // === ID_DCTO_PRODUCTO ===
            String query2 = "SELECT MAX(IdDctoProd) FROM DctoProd";
            Statement s2 = con.ObtenerConexion().createStatement();
            ResultSet rs2 = s2.executeQuery(query2);
            if (rs2.next()) {
                ID_DCTO_PRODUCTO = rs2.getInt(1) + 1;
            }
            rs2.close();
            s2.close();

            // === ID_DCTO_VENTA ===
            String query3 = "SELECT MAX(IdDctoVenta) FROM DctoVenta";
            Statement s3 = con.ObtenerConexion().createStatement();
            ResultSet rs3 = s3.executeQuery(query3);
            if (rs3.next()) {
                ID_DCTO_VENTA = rs3.getInt(1) + 1;
            }
            rs3.close();
            s3.close();
            
            // === ID_DETALLE_DOC_VENTA ===
            String query4 = "SELECT MAX(NumDocV) FROM DetalleDocVenta";
            Statement s4 = con.ObtenerConexion().createStatement();
            ResultSet rs4 = s4.executeQuery(query4);
            if (rs4.next()) {
                ID_DETALLE_DOC_VENTA = rs4.getInt(1) + 1;
            }
            rs4.close();
            s4.close();
            
            // === ID_PRODUCTO ===
            String query5 = "SELECT MAX(CodProd) FROM Producto";
            Statement s5 = con.ObtenerConexion().createStatement();
            ResultSet rs5 = s5.executeQuery(query5);
            if (rs5.next()) {
                ID_PRODUCTO = rs5.getInt(1) + 1;
            }
            rs5.close();
            s5.close();
            
           

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            con.closeConecction();
        }
    }
}
